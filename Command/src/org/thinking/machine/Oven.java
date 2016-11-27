package org.thinking.machine;

import org.thinking.machine.interfaces.InternetOfThings;

/**
 * Created by Robert Szczygielski on 27.11.16.
 */
public class Oven implements InternetOfThings {
    @Override
    public String setOn() {
        return "Oven is on";
    }

    @Override
    public String setOff() {
        return "Oven is off";
    }
}
