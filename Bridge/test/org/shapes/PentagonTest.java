package org.shapes;

import org.junit.Test;
import org.shapes.interfaces.Shape;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 04.12.16.
 */
public class PentagonTest {
    private final String name = "Pentagon";

    @Test
    public void shouldReturnStringPentagon() throws Exception {
        Shape circle = new Pentagon();
        String result = circle.getName();

        assertEquals(name, result);
    }
}
