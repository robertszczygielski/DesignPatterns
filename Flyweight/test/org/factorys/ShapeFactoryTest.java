package org.factorys;

import org.junit.Test;
import org.shape3d.Cylinder;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 05.12.16.
 */
public class ShapeFactoryTest {
    private String white = "White";

    @Test
    public void shouldReturnTheSameShape() throws Exception {
        Cylinder cylinder1 = ShapeFactory.getShape(white);
        Cylinder cylinder2 = ShapeFactory.getShape(white);

        assertEquals(cylinder1, cylinder2);
    }
}
