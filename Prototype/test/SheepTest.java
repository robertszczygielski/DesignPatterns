import org.animals.Sheep;
import org.animals.Wolf;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Robert Szczygielski on 20.11.16.
 */
public class SheepTest {
    @Test
    public void shouldCloneSheep() throws Exception {
        Sheep dolly = new Sheep();
        Sheep molly = (Sheep) dolly.clone();

        String[] expected = dolly.toString()
                                .split(";");
        String[] result = molly.toString()
                            .split(";");

        assertNotEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

    @Test
    public void shouldCloneWolf() throws Exception {
        Wolf wolf = new Wolf();
        Wolf wolf1 = (Wolf) wolf.clone();

        String[] expected = wolf.toString()
                                .split(";");
        String[] result = wolf1.toString()
                                .split(";");

        assertNotEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
}
