package org.meals.menus;

import org.meals.interfaces.Meal;

/**
 * Created by Robert Szczygielski on 13.11.16.
 */
public class BigBreakfast implements Meal {
    @Override
    public String eatMeal() {
        return "Scrambled eggs, roll, apple, banana";
    }
}
