package org.shape3d;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 05.12.16.
 */
public class CylinderTest {
    private String white = "White";
    private int height1 = 1;
    private int diameter1 = 2;

    @Test
    public void shouldReturnWhiteCylinderWithHeight1AndDiameter1() throws Exception {
        Cylinder cylinder = new Cylinder(white);
        cylinder.setHeight(height1);
        cylinder.setDiameter(diameter1);

        String result = cylinder.toString();

        assertEquals(white + ", H: " + height1 + ", D: " + diameter1, result);
    }
}
