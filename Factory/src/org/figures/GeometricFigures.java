package org.figures;

import org.figures.factory.FigureFactory;
import org.figures.factory.interfaces.Figure;

import java.math.BigDecimal;

/**
 * Created by Robert Szczygielski on 12.11.16.
 */
public class GeometricFigures {
    private static FigureFactory figureFactory = new FigureFactory();
    public BigDecimal countCircuit(BigDecimal... numbers) {
        Figure figure = figureFactory.getFigure(numbers.length);

        return figure.getCircuit(numbers);
    }
}
