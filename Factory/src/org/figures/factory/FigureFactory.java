package org.figures.factory;

import org.figures.Circle;
import org.figures.Rectangle;
import org.figures.Triangle;
import org.figures.factory.interfaces.Figure;

/**
 * Created by Robert Szczygielski on 12.11.16.
 */
public class FigureFactory {
    public Figure getFigure(int sides) {
        switch (sides) {
            case 1:
                return new Circle();
            case 2:
                return new Rectangle();
            case 3:
                return new Triangle();
            default:
                return null;
        }
    }
}
