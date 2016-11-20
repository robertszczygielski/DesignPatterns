package org.restaurant.menu;

import org.restaurant.menu.interfaces.Pizza;

import java.math.BigDecimal;

/**
 * Created by Robert Szczygielski on 20.11.16.
 */
public abstract class BasicPizza implements Pizza {
    Pizza pizza;

    public BasicPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getComponents() {
        return pizza.getComponents();
    }

    @Override
    public BigDecimal getPrice() {
        return pizza.getPrice();
    }
}
