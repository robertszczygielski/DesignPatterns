package org.meals.factory;

import org.enums.SizeOfTheMeal;
import org.meals.abstracts.MealOfTheDay;
import org.meals.interfaces.Meal;
import org.meals.menus.BigSupper;
import org.meals.menus.MediumSupper;
import org.meals.menus.SmallSupper;

/**
 * Created by Robert Szczygielski on 13.11.16.
 */
public class FactorySupperMenu extends MealOfTheDay {
    public FactorySupperMenu(SizeOfTheMeal mealSize) {
        super(mealSize);
    }

    @Override
    public Meal getMeal() {
        switch (mealSize) {
            case SMALL:
                return new SmallSupper();
            case MEDIUM:
                return new MediumSupper();
            case BIG:
                return new BigSupper();
            default:
                return null;
        }
    }
}
