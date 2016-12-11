package org.penthouse;

import org.house.interfaces.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 11.12.16.
 */
public class DiningroomTest {
    private final String testOven = "Make cake";
    private final String testKettle = "Make coffee";
    private Room diningroom;

    @Before
    public void setup() {
        diningroom = new Diningroom();
    }

    @Test
    public void shouldReturnMakeCake() throws Exception {
        String result = diningroom.nowInOven();

        assertEquals(testOven, result);
    }

    @Test
    public void shouldReturnMakeCoffee() throws Exception {
        String result = diningroom.nowInKettle();

        assertEquals(testKettle, result);
    }
}
