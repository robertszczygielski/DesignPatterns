package org.shapes;

import org.junit.Test;
import org.shapes.interfaces.Shape;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 04.12.16.
 */
public class CircleTest {
    private final String name = "Circle";

    @Test
    public void shouldReturnStringCircle() throws Exception {
        Shape circle = new Circle();
        String result = circle.getName();

        assertEquals(name, result);
    }
}
