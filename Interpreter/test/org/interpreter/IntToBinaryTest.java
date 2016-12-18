package org.interpreter;

import org.interpreter.context.NumberContext;
import org.interpreter.interfaces.IntToConverter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 18.12.16.
 */
@RunWith(MockitoJUnitRunner.class)
public class IntToBinaryTest {
    @Mock
    private NumberContext numberContext;
    private String returnBinary = "111";

    @Before
    public void setup() {
        Mockito.when(numberContext.convertToBinary(Matchers.anyInt())).thenReturn(returnBinary);
    }

    @Test
    public void shouldReturnBinaryCodeOfIntegerNumber() throws Exception {
        IntToConverter intToBinary = new IntToBinary(7);
        String result = intToBinary.convert(numberContext);

        assertEquals(returnBinary, result);
    }
}
