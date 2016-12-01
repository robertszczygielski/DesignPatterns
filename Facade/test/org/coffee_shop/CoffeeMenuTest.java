package org.coffee_shop;

import org.in_the_cafeteria.CoffeeCappuccino;
import org.in_the_cafeteria.CoffeeEspresso;
import org.in_the_cafeteria.CoffeeLate;
import org.in_the_cafeteria.interfaces.MakeCoffee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 01.12.16.
 */
public class CoffeeMenuTest {
    private CoffeeMenu coffeeMenu;

    @Before
    public void setup() {
        coffeeMenu = new CoffeeMenu();
    }

    @Test
    public void testEspresso() throws Exception {
        MakeCoffee mc = new CoffeeEspresso();
        String result = coffeeMenu.prepareEspresso();

        assertEquals(mc.getOrder(), result);
    }

    @Test
    public void testCappuccino() throws Exception {
        MakeCoffee mc = new CoffeeCappuccino();
        String result = coffeeMenu.prepareCappuccino();

        assertEquals(mc.getOrder(), result);
    }

    @Test
    public void testLate() throws Exception {
        MakeCoffee mc = new CoffeeLate();
        String result = coffeeMenu.prepareLate();

        assertEquals(mc.getOrder(), result);
    }
}
