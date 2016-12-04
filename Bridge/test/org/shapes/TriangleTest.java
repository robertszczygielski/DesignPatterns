package org.shapes;

import org.junit.Test;
import org.shapes.interfaces.Shape;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 04.12.16.
 */
public class TriangleTest {
    private final String name = "Triangle";

    @Test
    public void shouldReturnStringTriangle() throws Exception {
        Shape circle = new Triangle();
        String result = circle.getName();

        assertEquals(name, result);
    }
}
