package org.peoples;

import org.junit.Test;
import org.peoples.interfaces.Observer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Robert Szczygielski on 11.11.16.
 */
public class CustomerTest {
    private String customerTestNAme = "CustomerName";

    @Test
    public void shouldReturnCustomerName() throws Exception {
        Customer testCustomer = new Customer(customerTestNAme);
        String result = testCustomer.getName();

        assertEquals(customerTestNAme, result);
    }

    @Test
    public void checkIfCustomerImplementsObserverInterface() throws Exception {
        Class<?> testCustomer = Customer.class;

        assertTrue(Observer.class.isAssignableFrom(testCustomer));
    }
}
