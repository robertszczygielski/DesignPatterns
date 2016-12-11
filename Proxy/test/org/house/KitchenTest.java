package org.house;

import org.house.interfaces.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 11.12.16.
 */
public class KitchenTest {
    private final String testOven = "Make cake";
    private final String testKettle = "Make coffee";
    private final String testPan = "Make eggs";
    private Room kitchen;

    @Before
    public void setup() {
        kitchen = new Kitchen();
    }

    @Test
    public void shouldReturnMakeCake() throws Exception {
        String result = kitchen.nowInOven();

        assertEquals(testOven, result);
    }

    @Test
    public void shouldReturnMakeCoffee() throws Exception {
        String result = kitchen.nowInKettle();

        assertEquals(testKettle, result);
    }

    @Test
    public void shouldReturnMakeEggs() throws Exception {
        String result = kitchen.nowInPan();

        assertEquals(testPan, result);
    }
}
