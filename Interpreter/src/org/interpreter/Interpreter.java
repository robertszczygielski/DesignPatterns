package org.interpreter;

import org.interpreter.context.NumberContext;
import org.interpreter.interfaces.IntToConverter;

/**
 * Created by Robert Szczygielski on 18.12.16.
 */
public class Interpreter {
    private NumberContext numberContext;

    public Interpreter(NumberContext numberContext) {
        this.numberContext = numberContext;
    }

    public String interpret(String toConvert) {
        IntToConverter intToConverter = null;
        if (toConvert.contains("Binary")) {
            int numb = Integer.parseInt(
                    toConvert.substring(
                            0, toConvert.indexOf(" ")));
            intToConverter = new IntToBinary(numb);
        } else if (toConvert.contains("Hex")) {
            int numb = Integer.parseInt(
                    toConvert.substring(
                            0, toConvert.indexOf(" ")));
            intToConverter = new IntToHex(numb);
        } else {
            return toConvert;
        }
        return intToConverter.convert(numberContext);
    }
}
