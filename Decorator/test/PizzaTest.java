import org.junit.Before;
import org.junit.Test;
import org.restaurant.menu.FrogPizza;
import org.restaurant.menu.HamPizza;
import org.restaurant.menu.Margarita;
import org.restaurant.menu.interfaces.Pizza;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 20.11.16.
 */
public class PizzaTest {
    private final String componentsMargarita = "Chase, Tomatoes";
    private final String componentHam = ", Ham";
    private final String componentFrog = ", Frog";
    private final BigDecimal priceMargarita = new BigDecimal("1.1");
    private final BigDecimal priceHam = new BigDecimal("0.4");
    private final BigDecimal priceFrog = BigDecimal.ONE;

    private Pizza margarita;

    @Before
    public void setup() {
        margarita = new Margarita();
    }

    @Test
    public void shouldReturnComponentsAndPriceBasicPizza() throws Exception {
        String components = margarita.getComponents();
        assertEquals(componentsMargarita, components);

        BigDecimal price = margarita.getPrice();
        assertEquals(priceMargarita, price);
    }

    @Test
    public void shouldReturnComponentsAndPricePizzaWithHam() throws Exception {
        margarita = new HamPizza(margarita);

        String components = margarita.getComponents();
        assertEquals(componentsMargarita + componentHam, components);

        BigDecimal price = margarita.getPrice();
        assertEquals(priceMargarita.add(priceHam), price);
    }

    @Test
    public void shouldReturnComponentsAndPriceFrogPizza() throws Exception {
        margarita = new FrogPizza(margarita);

        String components = margarita.getComponents();
        assertEquals(componentsMargarita + componentFrog, components);

        BigDecimal price = margarita.getPrice();
        assertEquals(priceMargarita.add(priceFrog), price);
    }

    @Test
    public void shouldReturnComponentsAndPriceForMixHamAndFrogPizza() throws Exception {
        margarita = new HamPizza(margarita);
        margarita = new FrogPizza(margarita);

        String components = margarita.getComponents();
        assertEquals(componentsMargarita + componentHam + componentFrog, components);

        BigDecimal price = margarita.getPrice();
        assertEquals(priceMargarita.add(priceFrog).add(priceHam), price);
    }
}
