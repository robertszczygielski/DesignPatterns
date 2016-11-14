import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Robert Szczygielski on 14.11.16.
 */
public class SingleTest {
    @Test
    public void shouldReturnOnlyOneObject() throws Exception {
        Single single1 = Single.getInstance();
        Single single2 = Single.getInstance();

        assertTrue(single1 == single2);
        assertEquals(single1.getSillyText(), single2.getSillyText());
    }
}
