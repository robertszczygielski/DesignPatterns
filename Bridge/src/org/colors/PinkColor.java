package org.colors;

import org.colors.abstracts.Color;
import org.shapes.interfaces.Shape;

/**
 * Created by Robert Szczygielski on 04.12.16.
 */
public class PinkColor extends Color {
    public PinkColor(Shape shape) {
        super(shape);
    }

    @Override
    public String draw() {
        return "Pink " + shape.getName();
    }
}
