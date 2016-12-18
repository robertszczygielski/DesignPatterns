package org.interpreter;

import org.interpreter.context.NumberContext;
import org.interpreter.interfaces.IntToConverter;

/**
 * Created by Robert Szczygielski on 18.12.16.
 */
public class IntToHex implements IntToConverter{
    private int toConcert;

    public IntToHex(int toConvert) {
        this.toConcert = toConvert;
    }

    @Override
    public String convert(NumberContext numberContext) {
        return numberContext.convertToHex(toConcert);
    }
}
