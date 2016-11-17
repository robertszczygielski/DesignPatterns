import org.constructors.ConstructCustomer;
import org.junit.Before;
import org.junit.Test;
import org.peoples.Customer;
import org.prototypes.CustomerPrototype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Robert Szczygielski on 17.11.16.
 */
public class ConstructorTest {
    private CustomerPrototype customerPrototype;
    private final String testName = "testName";
    private final Integer testAge = 22;

    @Before
    public void prepareCustomerPrototype() {
        customerPrototype = null;
    }

    @Test
    public void shouldReturnPrototypeWithName() throws Exception {
        customerPrototype = new CustomerPrototype()
                .useName(testName);
        String result = customerPrototype.getName();

        assertEquals(result, testName);
    }

    @Test
    public void shouldCheckIfPrototypeHasName() throws Exception {
        customerPrototype = new CustomerPrototype()
                .useName(testName);

        assertTrue(customerPrototype.ifHasName());
    }

    @Test
    public void shouldReturnCustomerWithName() throws Exception {
        Customer customer = new Customer();
        customer.setName(testName);
        String result = customer.getName();

        assertEquals(result, testName);
    }

    @Test
    public void shouldConstructCustomerWithDefaultName() throws Exception {
        Customer customer = new ConstructCustomer().buildFrom(new CustomerPrototype());
        String result = customer.getName();

        assertEquals(result, "NoName");
    }

    @Test
    public void shouldConstructCustomerWithTestName() throws Exception {
        customerPrototype = new CustomerPrototype().useName(testName);
        Customer customer = new ConstructCustomer().buildFrom(customerPrototype);
        String result = customer.getName();

        assertEquals(result, testName);
    }

    @Test
    public void shouldReturnPrototypeWithAge() throws Exception {
        customerPrototype = new CustomerPrototype()
                .useAge(testAge);
        Integer result = customerPrototype.getAge();

        assertEquals(result, testAge);
    }

    @Test
    public void shouldCheckIfPrototypeHasAge() throws Exception {
        customerPrototype = new CustomerPrototype()
                .useAge(testAge);

        assertTrue(customerPrototype.ifHasAge());
    }

    @Test
    public void shouldReturnCustomerWithAge() throws Exception {
        Customer customer = new Customer();
        customer.setAge(testAge);
        Integer result = customer.getAge();

        assertEquals(result, testAge);
    }

    @Test
    public void shouldConstructCustomerWithDefaultAge() throws Exception {
        Customer customer = new ConstructCustomer().buildFrom(new CustomerPrototype());
        Integer result = customer.getAge();

        assertEquals(result, new Integer("-1"));
    }

    @Test
    public void shouldConstructCustomerWithTestAge() throws Exception {
        customerPrototype = new CustomerPrototype().useAge(testAge);
        Customer customer = new ConstructCustomer().buildFrom(customerPrototype);
        Integer result = customer.getAge();

        assertEquals(result, testAge);
    }
}
