package org.meals.factory;

import org.enums.SizeOfTheMeal;
import org.meals.abstracts.MealOfTheDay;
import org.meals.interfaces.Meal;
import org.meals.menus.BigBreakfast;
import org.meals.menus.MediumBreakfast;
import org.meals.menus.SmallBreakfast;

/**
 * Created by Robert Szczygielski on 13.11.16.
 */
public class FactoryBreakfastMenu extends MealOfTheDay {
    public FactoryBreakfastMenu(SizeOfTheMeal mealSize) {
        super(mealSize);
    }

    @Override
    public Meal getMeal() {
        switch (mealSize) {
            case SMALL:
                return new SmallBreakfast();
            case MEDIUM:
                return new MediumBreakfast();
            case BIG:
                return new BigBreakfast();
            default:
                return null;
        }
    }
}
