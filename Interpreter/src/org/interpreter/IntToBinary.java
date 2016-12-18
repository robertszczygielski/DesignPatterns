package org.interpreter;

import org.interpreter.context.NumberContext;
import org.interpreter.interfaces.IntToConverter;

/**
 * Created by Robert Szczygielski on 18.12.16.
 */
public class IntToBinary implements IntToConverter {
    private int toConvert;

    public IntToBinary(int toConvert) {
        this.toConvert = toConvert;
    }

    @Override
    public String convert(NumberContext numberContext) {
        return numberContext.convertToBinary(toConvert);
    }
}
