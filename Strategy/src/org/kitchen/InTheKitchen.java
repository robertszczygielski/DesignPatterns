package org.kitchen;

import org.receptures.interfaces.RecipesForCakes;

/**
 * Created by Robert Szczygielski on 09.11.16.
 */
public class InTheKitchen {
    private RecipesForCakes recipesForCakes;

    public String bakeCake() {
        return recipesForCakes.bakeCake();
    }

    public void findRecipeFor(RecipesForCakes recipesForCakes) {
        this.recipesForCakes = recipesForCakes;
    }
}
