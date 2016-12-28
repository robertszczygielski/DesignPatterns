package org.shop.products;

import org.junit.Test;
import org.shop.products.interfaces.Sweets;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 28.12.16.
 */
public class MarsTest {
    private Sweets mars;

    @Test
    public void shouldReturn1For1Sweet() throws Exception {
        mars = new Mars(1);
        BigDecimal result = mars.getCost();

        assertEquals(BigDecimal.ONE, result);
    }

    @Test
    public void shouldReturn2For2Sweet() throws Exception {
        mars = new Mars(2);
        BigDecimal result = mars.getCost();

        assertEquals(new BigDecimal("2"), result);
    }

    @Test
    public void shouldReturn2_75For3Promotion() throws Exception {
        mars = new Mars(3);
        BigDecimal result = mars.getCost();

        assertEquals(new BigDecimal("2.75"), result);
    }
}
