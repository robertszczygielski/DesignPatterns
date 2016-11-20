package org.restaurant.menu;

import org.restaurant.menu.interfaces.Pizza;

import java.math.BigDecimal;

/**
 * Created by Robert Szczygielski on 20.11.16.
 */
public class HamPizza extends BasicPizza implements Pizza {
    private final BigDecimal hamPrice = new BigDecimal("0.4");

    public HamPizza(Pizza margarita) {
        super(margarita);
    }

    @Override
    public String getComponents() {
        return super.getComponents() + ", Ham";
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(hamPrice);
    }
}
