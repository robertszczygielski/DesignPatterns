package org.figures;

import org.figures.factory.interfaces.Figure;

import java.math.BigDecimal;

/**
 * Created by Robert Szczygielski on 12.11.16.
 */
public class Rectangle implements Figure {

    @Override
    public BigDecimal getCircuit(BigDecimal... numbers) {
        BigDecimal result = BigDecimal.ZERO;
        for (BigDecimal number : numbers) {
            result = result.add(number);
            result = result.add(number);
        }

        return result;
    }
}
