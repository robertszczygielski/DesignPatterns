package org.peoples;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Robert Szczygielski on 11.11.16.
 */
public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hello " + name + ", you cna now " + arg.toString() + " product");
    }
}
