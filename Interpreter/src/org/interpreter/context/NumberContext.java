package org.interpreter.context;

/**
 * Created by Robert Szczygielski on 18.12.16.
 */
public class NumberContext {
    public String convertToBinary(int toConvert) {
        return Integer.toBinaryString(toConvert);
    }

    public String convertToHex(int toConvert) {
        return Integer.toHexString(toConvert);
    }
}
