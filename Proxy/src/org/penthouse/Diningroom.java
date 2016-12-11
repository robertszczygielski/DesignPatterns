package org.penthouse;

import org.house.Kitchen;
import org.house.interfaces.Room;

/**
 * Created by Robert Szczygielski on 11.12.16.
 */
public class Diningroom implements Room {
    private Room kitchen;

    @Override
    public String nowInOven() {
        isKitchenPresent();
        return kitchen.nowInOven();
    }


    @Override
    public String nowInKettle() {
        isKitchenPresent();
        return kitchen.nowInKettle();
    }

    /*
     * @deprecated Never used
     */
    @Override
    @Deprecated
    public String nowInPan() { return null; }

    private void isKitchenPresent() {
        if(kitchen == null) kitchen = new Kitchen();
    }
}
