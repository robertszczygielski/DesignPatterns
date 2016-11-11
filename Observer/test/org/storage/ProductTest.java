package org.storage;

import org.junit.Test;
import org.storage.interfaces.Subject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Robert Szczygielski on 11.11.16.
 */
public class ProductTest {
    private String testName = "testName";
    private boolean testAvailable = false;
    
    @Test
    public void shouldReturnStringWithProductNameAndNotAvailability() throws Exception {
        Product testProduct = new Product(testName, testAvailable);
        String result = testProduct.toString();
        String[] resultArray = result.split("\\s");

        assertEquals(resultArray[0], testName);
        assertEquals(resultArray[resultArray.length-1], "not_available");

    }

    @Test
    public void shouldReturnStringWithProductNameAndAvailability() throws Exception {
        Product testProduct = new Product(testName, testAvailable);
        testProduct.setAvailable(true);
        String result = testProduct.toString();
        String[] resultArray = result.split("\\s");

        assertEquals(resultArray[0], testName);
        assertEquals(resultArray[resultArray.length-1], "available");

    }

    @Test
    public void checkIfProductImplementsSubjectInterface() throws Exception {
        Class<?> testProduct = Product.class;

        assertTrue(Subject.class.isAssignableFrom(testProduct));
    }
}
