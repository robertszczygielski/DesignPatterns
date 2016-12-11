package org.house;

import org.house.interfaces.Room;

/**
 * Created by Robert Szczygielski on 11.12.16.
 */
public class Kitchen implements Room {
    public String nowInOven() {
        return "Make cake";
    }

    public String nowInKettle() {
        return "Make coffee";
    }

    public String nowInPan() {
        return "Make eggs";
    }
}
