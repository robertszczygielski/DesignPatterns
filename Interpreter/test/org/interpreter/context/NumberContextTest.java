package org.interpreter.context;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 18.12.16.
 */
public class NumberContextTest {
    private NumberContext numberContext;

    @Before
    public void setup() {
        numberContext = new NumberContext();
    }

    @Test
    public void shouldReturn111For7() throws Exception {
        String result = numberContext.convertToBinary(7);

        assertEquals("111", result);
    }

    @Test
    public void shouldReturnSmallBFor11() throws Exception {
        String result = numberContext.convertToHex(11);

        assertEquals("b", result);
    }
}
