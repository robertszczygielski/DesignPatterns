package org.constructors;

import org.peoples.Customer;
import org.prototypes.CustomerPrototype;

/**
 * Created by Robert Szczygielski on 17.11.16.
 */
public class ConstructCustomer {
    Customer customer;

    public ConstructCustomer() {
        customer = new Customer();
    }

    public Customer buildFrom(CustomerPrototype customerPrototype) {
        if(customerPrototype.ifHasName()) {
            customer.setName(customerPrototype.getName());
        } else {
            customer.setName("NoName");
        }

        if(customerPrototype.ifHasAge()) {
            customer.setAge(customerPrototype.getAge());
        } else {
            customer.setAge(new Integer("-1"));
        }

        return customer;
    }
}
