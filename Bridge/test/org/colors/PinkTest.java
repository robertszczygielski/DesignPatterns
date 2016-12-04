package org.colors;

import org.colors.abstracts.Color;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.shapes.interfaces.Shape;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 04.12.16.
 */
@RunWith(MockitoJUnitRunner.class)
public class PinkTest {
    @Mock
    private Shape shape;
    private final String name = "Pink Shape";

    @Test
    public void shouldReturnStringRedShape() throws Exception {
        Mockito.when(shape.getName()).thenReturn("Shape");
        Color circle = new PinkColor(shape);
        String result = circle.draw();

        assertEquals(name, result);
    }
}
