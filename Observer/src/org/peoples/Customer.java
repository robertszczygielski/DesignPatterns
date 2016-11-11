package org.peoples;

import org.peoples.interfaces.Observer;

/**
 * Created by Robert Szczygielski on 11.11.16.
 */
public class Customer implements Observer{
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String isAvailable(boolean available) {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" the product change status to: ");
        if(available) {
            sb.append("available");
        } else {
            sb.append("not_available");
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return name != null ? name.equals(customer.name) : customer.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
