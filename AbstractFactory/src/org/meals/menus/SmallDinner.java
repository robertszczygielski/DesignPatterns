package org.meals.menus;

import org.meals.interfaces.Meal;

/**
 * Created by Robert Szczygielski on 13.11.16.
 */
public class SmallDinner implements Meal {
    @Override
    public String eatMeal() {
        return "Soup";
    }
}
