package org.figures.factory.interfaces;

import java.math.BigDecimal;

/**
 * Created by Robert Szczygielski on 12.11.16.
 */
public interface Figure {
    BigDecimal getCircuit(BigDecimal... numbers);
}
