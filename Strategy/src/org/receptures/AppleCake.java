package org.receptures;

import org.receptures.interfaces.RecipesForCakes;

/**
 * Created by Robert Szczygielski on 09.11.16.
 */
public class AppleCake implements RecipesForCakes {
    @Override
    public String bakeCake() {
        return "Simple Apple Cake";
    }
}
