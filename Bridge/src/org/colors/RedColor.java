package org.colors;

import org.colors.abstracts.Color;
import org.shapes.interfaces.Shape;


/**
 * Created by Robert Szczygielski on 04.12.16.
 */
public class RedColor extends Color {
    public RedColor(Shape shape) {
        super(shape);
    }

    @Override
    public String draw() {
        return "Red " + shape.getName();
    }
}
