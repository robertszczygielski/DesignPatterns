package org.storage;

import org.peoples.Customer;
import org.peoples.interfaces.Observer;
import org.storage.interfaces.Subject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Robert Szczygielski on 11.11.16.
 */
public class Product implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String name;
    private boolean available;

    public Product(String name, boolean available) {
        this.name = name;
        this.available = available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        notifyObservers();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" is now: ");
        if(available) {
            sb.append("available");
        } else {
            sb.append("not_available");
        }

        return sb.toString();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public int howManyObservers() {
        return observers.size();
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.isAvailable(available);
        }
    }
}
