package org.in_the_cafeteria;

import org.in_the_cafeteria.interfaces.MakeCoffee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 01.12.16.
 */
public class CoffeeLateTest {
    private final String testString = "MakesLate";

    @Test
    public void shouldReturnStringMakesLate() throws Exception {
        MakeCoffee makeLate = new CoffeeLate();
        String result = makeLate.getOrder();

        assertEquals(testString, result);
    }
}
