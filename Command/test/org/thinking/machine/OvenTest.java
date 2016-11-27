package org.thinking.machine;

import org.junit.Test;
import org.thinking.machine.interfaces.InternetOfThings;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 27.11.16.
 */
public class OvenTest {
    @Test
    public void shouldReturnOvenIsOn() throws Exception {
        InternetOfThings oven = new Oven();
        String result = oven.setOn();

        assertEquals("Oven is on", result);
    }

    @Test
    public void shouldReturnOvenIsOff() throws Exception {
        InternetOfThings oven = new Oven();
        String result = oven.setOff();

        assertEquals("Oven is off", result);
    }
}
