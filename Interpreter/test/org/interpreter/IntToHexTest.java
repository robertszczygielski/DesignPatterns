package org.interpreter;

import org.interpreter.context.NumberContext;
import org.interpreter.interfaces.IntToConverter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 18.12.16.
 */
@RunWith(MockitoJUnitRunner.class)
public class IntToHexTest {
    @Mock
    private NumberContext numberContext;
    private String returnHex = "d";

    @Before
    public void setup() {
        Mockito.when(numberContext.convertToHex(Mockito.anyInt())).thenReturn(returnHex);
    }

    @Test
    public void shouldReturnSmallDFor13() throws Exception {
        IntToConverter intToHex = new IntToHex(13);
        String result = intToHex.convert(numberContext);

        assertEquals(returnHex, result);
    }
}
