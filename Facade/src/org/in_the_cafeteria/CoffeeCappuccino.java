package org.in_the_cafeteria;

import org.in_the_cafeteria.interfaces.MakeCoffee;

/**
 * Created by Robert Szczygielski on 01.12.16.
 */
public class CoffeeCappuccino implements MakeCoffee {
    @Override
    public String getOrder() {
        return "MakesCappuccino";
    }
}
