package org.kitchen;

import org.junit.Test;
import org.meals.abstracts.MealOfTheDay;
import org.meals.interfaces.Meal;

import static org.enums.SizeOfTheMeal.BIG;
import static org.enums.SizeOfTheMeal.MEDIUM;
import static org.enums.SizeOfTheMeal.SMALL;
import static org.enums.TimeOfDay.BREAKFAST;
import static org.enums.TimeOfDay.DINNER;
import static org.enums.TimeOfDay.SUPPER;
import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 13.11.16.
 */
public class KitchenFactoryTest {
    @Test
    public void shouldPrepareSmallBreakfast() throws Exception {
        MealOfTheDay mealOfTheDay = KitchenFactory.prepareMeal(BREAKFAST, SMALL);
        Meal result = mealOfTheDay.getMeal();

        assertEquals("Banana", result.eatMeal());
    }

    @Test
    public void shouldPrepareMediumBreakfast() throws Exception {
        MealOfTheDay mealOfTheDay = KitchenFactory.prepareMeal(BREAKFAST, MEDIUM);
        Meal result = mealOfTheDay.getMeal();

        assertEquals("Scrambled eggs, roll", result.eatMeal());
    }

    @Test
    public void shouldPrepareBigBreakfast() throws Exception {
        MealOfTheDay mealOfTheDay = KitchenFactory.prepareMeal(BREAKFAST, BIG);
        Meal result = mealOfTheDay.getMeal();

        assertEquals("Scrambled eggs, roll, apple, banana", result.eatMeal());
    }

    @Test
    public void shouldPrepareSmallDinner() throws Exception {
        MealOfTheDay mealOfTheDay = KitchenFactory.prepareMeal(DINNER, SMALL);
        Meal result = mealOfTheDay.getMeal();

        assertEquals("Soup", result.eatMeal());
    }

    @Test
    public void shouldPrepareMediumDinner() throws Exception {
        MealOfTheDay mealOfTheDay = KitchenFactory.prepareMeal(DINNER, MEDIUM);
        Meal result = mealOfTheDay.getMeal();

        assertEquals("Pizza", result.eatMeal());
    }

    @Test
    public void shouldPrepareBigDinner() throws Exception {
        MealOfTheDay mealOfTheDay = KitchenFactory.prepareMeal(DINNER, BIG);
        Meal result = mealOfTheDay.getMeal();

        assertEquals("Chicken, Chips, Fish, Apple", result.eatMeal());
    }

    @Test
    public void shouldPrepareSmallSupper() throws Exception {
        MealOfTheDay mealOfTheDay = KitchenFactory.prepareMeal(SUPPER, SMALL);
        Meal result = mealOfTheDay.getMeal();

        assertEquals("Kiwi", result.eatMeal());
    }

    @Test
    public void shouldPrepareMediumSupper() throws Exception {
        MealOfTheDay mealOfTheDay = KitchenFactory.prepareMeal(SUPPER, MEDIUM);
        Meal result = mealOfTheDay.getMeal();

        assertEquals("Beef-and-Pineapple", result.eatMeal());
    }

    @Test
    public void shouldPrepareBigSupper() throws Exception {
        MealOfTheDay mealOfTheDay = KitchenFactory.prepareMeal(SUPPER, BIG);
        Meal result = mealOfTheDay.getMeal();

        assertEquals("Slow-Cooker Chicken Tortilla Soup", result.eatMeal());
    }
}
