package org.meals.factory;

import org.enums.SizeOfTheMeal;
import org.meals.abstracts.MealOfTheDay;
import org.meals.interfaces.Meal;
import org.meals.menus.BigDinner;
import org.meals.menus.MediumDinner;
import org.meals.menus.SmallDinner;

/**
 * Created by Robert Szczygielski on 13.11.16.
 */
public class FactoryDinnerMenu extends MealOfTheDay {
    public FactoryDinnerMenu(SizeOfTheMeal mealSize) {
        super(mealSize);
    }

    @Override
    public Meal getMeal() {
        switch(mealSize) {
            case SMALL:
                return new SmallDinner();
            case MEDIUM:
                return new MediumDinner();
            case BIG:
                return new BigDinner();
            default:
                return null;
        }
    }
}
