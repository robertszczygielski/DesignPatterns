package org.meals.menus;

import org.meals.interfaces.Meal;

/**
 * Created by Robert Szczygielski on 13.11.16.
 */
public class BigDinner implements Meal {
    @Override
    public String eatMeal() {
        return "Chicken, Chips, Fish, Apple";
    }
}
