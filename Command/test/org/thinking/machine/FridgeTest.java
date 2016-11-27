package org.thinking.machine;

import org.junit.Before;
import org.junit.Test;
import org.thinking.machine.interfaces.InternetOfThings;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 27.11.16.
 */
public class FridgeTest {
    private InternetOfThings fridge;

    @Before
    public void setup() {
        fridge = new Fridge();
    }

    @Test
    public void shouldReturnStringIAmOn() throws Exception {
        String result = fridge.setOn();

        assertEquals("Fridge is on", result);
    }

    @Test
    public void shouldReturnStringIAmOff() throws Exception {
        String result = fridge.setOff();

        assertEquals("Fridge is off", result);
    }
}
