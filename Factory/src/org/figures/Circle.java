package org.figures;

import org.figures.factory.interfaces.Figure;

import java.math.BigDecimal;

/**
 * Created by Robert Szczygielski on 12.11.16.
 */
public class Circle implements Figure {
    @Override
    public BigDecimal getCircuit(BigDecimal... numbers) {
        BigDecimal result = null;
        for (BigDecimal number : numbers) {
            result = number.multiply(number);
        }

        result = result.multiply(
                BigDecimal.valueOf(
                        Math.PI
                )
        );

        return result;
    }
}
