package org.meals.abstracts;

import org.enums.SizeOfTheMeal;
import org.meals.interfaces.Meal;

/**
 * Created by Robert Szczygielski on 13.11.16.
 */
public abstract class MealOfTheDay {
    protected SizeOfTheMeal mealSize;

    protected MealOfTheDay(SizeOfTheMeal mealSize) {
        this.mealSize = mealSize;
    }

    abstract public Meal getMeal();
}
