package org.restaurant.menu;

import org.restaurant.menu.interfaces.Pizza;

import java.math.BigDecimal;

/**
 * Created by Robert Szczygielski on 20.11.16.
 */
public class Margarita implements Pizza {
    private String components = "Chase, Tomatoes";
    private BigDecimal price = new BigDecimal("1.1");

    @Override
    public String getComponents() {
        return components;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
