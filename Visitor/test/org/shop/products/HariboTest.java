package org.shop.products;

import org.junit.Test;
import org.shop.products.interfaces.Sweets;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 28.12.16.
 */
public class HariboTest {

    private Sweets mars;

    @Test
    public void shouldReturn1_5For1Sweet() throws Exception {
        mars = new Haribo(1);
        BigDecimal result = mars.getCost();

        assertEquals(new BigDecimal("1.5"), result);
    }

    @Test
    public void shouldReturn3_0For2Sweet() throws Exception {
        mars = new Haribo(2);
        BigDecimal result = mars.getCost();

        assertEquals(new BigDecimal("3.0"), result);
    }

    @Test
    public void shouldReturn5For4Promotion() throws Exception {
        mars = new Haribo(4);
        BigDecimal result = mars.getCost();

        assertEquals(new BigDecimal("5.0"), result);
    }
}
