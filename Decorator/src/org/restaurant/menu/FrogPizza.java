package org.restaurant.menu;

import org.restaurant.menu.interfaces.Pizza;

import java.math.BigDecimal;

/**
 * Created by Robert Szczygielski on 20.11.16.
 */
public class FrogPizza extends BasicPizza implements Pizza {
    private final BigDecimal frogPrice = BigDecimal.ONE;

    public FrogPizza(Pizza margarita) {
        super(margarita);
    }

    @Override
    public String getComponents() {
        return super.getComponents() + ", Frog";
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(frogPrice);
    }
}
