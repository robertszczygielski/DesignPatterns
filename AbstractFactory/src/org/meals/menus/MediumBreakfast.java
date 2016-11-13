package org.meals.menus;

import org.meals.interfaces.Meal;

/**
 * Created by Robert Szczygielski on 13.11.16.
 */
public class MediumBreakfast implements Meal {
    @Override
    public String eatMeal() {
        return "Scrambled eggs, roll";
    }
}
