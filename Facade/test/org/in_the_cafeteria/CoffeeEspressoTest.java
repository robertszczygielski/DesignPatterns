package org.in_the_cafeteria;

import org.in_the_cafeteria.interfaces.MakeCoffee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 01.12.16.
 */
public class CoffeeEspressoTest {
    private final String testString = "MakesEspresso";

    @Test
    public void shouldReturnStringMakesLate() throws Exception {
        MakeCoffee makeLate = new CoffeeEspresso();
        String result = makeLate.getOrder();

        assertEquals(testString, result);
    }
}
