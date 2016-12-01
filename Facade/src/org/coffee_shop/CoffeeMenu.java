package org.coffee_shop;

import org.in_the_cafeteria.CoffeeCappuccino;
import org.in_the_cafeteria.CoffeeEspresso;
import org.in_the_cafeteria.CoffeeLate;
import org.in_the_cafeteria.interfaces.MakeCoffee;

/**
 * Created by Robert Szczygielski on 01.12.16.
 */
public class CoffeeMenu {
    private MakeCoffee cappuccino;
    private MakeCoffee espresso;
    private MakeCoffee late;

    public CoffeeMenu() {
        cappuccino = new CoffeeCappuccino();
        espresso = new CoffeeEspresso();
        late = new CoffeeLate();
    }

    public String prepareEspresso() {
        return espresso.getOrder();
    }

    public String prepareCappuccino() {
        return cappuccino.getOrder();
    }

    public String prepareLate() {
        return late.getOrder();
    }
}
