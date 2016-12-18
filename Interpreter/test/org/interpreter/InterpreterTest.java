package org.interpreter;

import org.interpreter.context.NumberContext;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 18.12.16.
 */
public class InterpreterTest {
    private String toBinary = "28 to Binary";
    private String toHex = "28 to Hex";
    private String binaryResult = "11100";
    private String hexResult = "1c";
    private NumberContext numberContext;

    @Before
    public void setup() {
        numberContext = new NumberContext();
    }

    @Test
    public void shouldReturn11100For28() throws Exception {
        Interpreter interpreter = new Interpreter(numberContext);
        String result = interpreter.interpret(toBinary);

        assertEquals(binaryResult, result);
    }

    @Test
    public void shouldReturn1cFor28() throws Exception {
        Interpreter interpreter = new Interpreter(numberContext);
        String result = interpreter.interpret(toHex);

        assertEquals(hexResult, result);
    }

    @Test
    public void shouldNotConvert() throws Exception {
        Interpreter interpreter = new Interpreter(numberContext);
        String result = interpreter.interpret("ABCD");

        assertEquals("ABCD", result);
    }
}
