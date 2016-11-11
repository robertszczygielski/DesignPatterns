package org.storage;

import java.util.Observable;

/**
 * Created by Robert Szczygielski on 11.11.16.
 */
public class Product extends Observable {
    private String name;
    private boolean availability;

    public Product(String name, boolean availability) {
        this.name = name;
        this.availability = availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
        if(availability) {
            setChanged();
            notifyObservers("order");
        } else {
            setChanged();
            notifyObservers("reserved");
        }
    }
}
