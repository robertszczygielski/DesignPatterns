package org.colors.abstracts;

import org.shapes.interfaces.Shape;

/**
 * Created by Robert Szczygielski on 04.12.16.
 */
public abstract class Color {
    protected Shape shape;

    public Color(Shape shape) {
        this.shape = shape;
    }

    public abstract String draw();
}
