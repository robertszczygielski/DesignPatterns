import org.junit.Test;
import org.peoples.Customer;
import org.storage.Product;

/**
 * Created by Robert Szczygielski on 11.11.16.
 */
public class TestObserver {
    private String testCustomer1 = "testCustomer1";
    private String testCustomer2 = "testCustomer2";
    private String testProduct1 = "testProduct1";

    @Test
    public void sillyTestProductAndCustomer() throws Exception {
        Customer c1 = new Customer(testCustomer1);
        Customer c2 = new Customer(testCustomer2);

        Product product = new Product(testProduct1, false);

        product.addObserver(c1);
        product.addObserver(c2);

        product.setAvailability(true);
        product.setAvailability(false);
    }
}
