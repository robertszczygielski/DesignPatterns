package org.devices;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 07.12.16.
 */
public class TvTest {
    private Tv tv;

    @Before
    public void setup() {
        tv = new Tv();
    }

    @Test
    public void shouldOnTvAndReturnStringTvIsOn() throws Exception {
        tv.on();
        String result = tv.getState()
                            .stateName();

        assertEquals("Tv is on", result);
    }

    @Test
    public void shouldOffTvAndReturnStringTvIsOff() throws Exception {
        tv.off();
        String result = tv.getState()
                .stateName();

        assertEquals("Tv is off", result);
    }
}
