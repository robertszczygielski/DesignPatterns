package org.figures;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 12.11.16.
 */
public class GeometricFiguresTest {
    private BigDecimal r = new BigDecimal("3");
    private BigDecimal a = new BigDecimal("1");
    private BigDecimal b = new BigDecimal("2");
    private BigDecimal c = new BigDecimal("5");

    private GeometricFigures geometricFigures;

    @Before
    public void setup() {
        geometricFigures = new GeometricFigures();
    }

    @Test
    public void shouldCountCircuitForTheCircle() throws Exception {
        BigDecimal result = geometricFigures.countCircuit(r);
        BigDecimal expected = r.multiply(r);
        expected = expected.multiply(BigDecimal.valueOf(Math.PI));

        assertEquals(expected, result);
    }

    @Test
    public void shouldCountCircuitForRectangle() throws Exception {
        BigDecimal result = geometricFigures.countCircuit(a, b);
        a = a.add(a);
        b = b.add(b);
        BigDecimal expected = a.add(b);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCircuitForTriangle() throws Exception {
        BigDecimal result = geometricFigures.countCircuit(a, b, c);
        BigDecimal expected = a.add(b);
        expected = expected.add(c);

        assertEquals(expected, result);
    }
}
