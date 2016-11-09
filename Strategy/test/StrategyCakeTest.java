import org.junit.Before;
import org.junit.Test;
import org.receptures.AppleCake;
import org.receptures.BirthdayCake;
import org.kitchen.InTheKitchen;
import org.receptures.CakeForUnannouncedVisitMotherInLaw;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 09.11.16.
 */
public class StrategyCakeTest {

    private InTheKitchen inTheKitchen;

    @Before
    public void setup() {
        inTheKitchen = new InTheKitchen();
    }

    @Test
    public void shouldPrepareFastCakeForUnannouncedVisitMotherInLaw() throws Exception {
        inTheKitchen.findRecipeFor(new CakeForUnannouncedVisitMotherInLaw());
        String result = inTheKitchen.bakeCake();

        assertEquals("Cake for mother", result);
    }

    @Test
    public void shouldPrepareBirthdayCake() throws Exception {
        inTheKitchen.findRecipeFor(new BirthdayCake());
        String result = inTheKitchen.bakeCake();

        assertEquals("Birthday Teddybear cake", result);
    }

    @Test
    public void shouldPrepareAppleCake() throws Exception {
        inTheKitchen.findRecipeFor(new AppleCake());
        String result = inTheKitchen.bakeCake();

        assertEquals("Simple Apple Cake", result);
    }
}
