package org.kitchen;

import org.enums.SizeOfTheMeal;
import org.enums.TimeOfDay;
import org.meals.factory.FactoryBreakfastMenu;
import org.meals.abstracts.MealOfTheDay;
import org.meals.factory.FactoryDinnerMenu;
import org.meals.factory.FactorySupperMenu;


/**
 * Created by Robert Szczygielski on 13.11.16.
 */
public class KitchenFactory {
    private KitchenFactory() {}

    public static MealOfTheDay prepareMeal(TimeOfDay mealsADay, SizeOfTheMeal mealSize) {
        switch (mealsADay) {
            case BREAKFAST:
                return new FactoryBreakfastMenu(mealSize);
            case DINNER:
                return new FactoryDinnerMenu(mealSize);
            case SUPPER:
                return new FactorySupperMenu(mealSize);
            default:
                return null;
        }
    }
}
