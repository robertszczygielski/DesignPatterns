package org.storage;

import org.junit.Test;
import org.peoples.Customer;
import org.peoples.interfaces.Observer;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 11.11.16.
 */
public class ObserverTest {
    private String testProduct = "testProduct";
    private String testCustomer = "testCustomer";
    private String testCustomer2 = "testCustomer2";

    @Test
    public void shouldSendInformationToCustomersAfterUpdateAvailable() throws Exception {
        Customer c1 = new Customer(testCustomer);
        Customer c2 = new Customer(testCustomer2);

        Product tProduct = new Product(testProduct, false);

        tProduct.registerObserver(c1);
        tProduct.registerObserver(c2);

        int result = tProduct.howManyObservers();
        assertEquals(2, result);

        tProduct.removeObserver(c1);
        result = tProduct.howManyObservers();
        assertEquals(1, result);

        Class c = tProduct.getClass();
        Field field = c.getDeclaredField("observers");

        field.setAccessible(true);
        List<Observer> observers = (List<Observer>) field.get(tProduct);
        field.setAccessible(false);
        Customer toCheck = (Customer) observers.get(0);
        
        assertEquals(toCheck.getName(), testCustomer2);
    }
}
