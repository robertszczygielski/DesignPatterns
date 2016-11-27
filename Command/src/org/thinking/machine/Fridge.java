package org.thinking.machine;

import org.thinking.machine.interfaces.InternetOfThings;

/**
 * Created by Robert Szczygielski on 27.11.16.
 */
public class Fridge implements InternetOfThings {
    @Override
    public String setOn() {
        return "Fridge is on";
    }

    @Override
    public String setOff() {
        return "Fridge is off";
    }
}
