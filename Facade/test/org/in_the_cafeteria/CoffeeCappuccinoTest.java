package org.in_the_cafeteria;

import org.in_the_cafeteria.interfaces.MakeCoffee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 01.12.16.
 */
public class CoffeeCappuccinoTest {
    private final String testString = "MakesCappuccino";

    @Test
    public void shouldReturnStringMakesLate() throws Exception {
        MakeCoffee makeLate = new CoffeeCappuccino();
        String result = makeLate.getOrder();

        assertEquals(testString, result);
    }
}
