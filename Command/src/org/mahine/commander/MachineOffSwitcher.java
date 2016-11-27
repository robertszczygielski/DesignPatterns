package org.mahine.commander;

import org.mahine.commander.interfaces.Commander;
import org.thinking.machine.interfaces.InternetOfThings;

/**
 * Created by Robert Szczygielski on 27.11.16.
 */
public class MachineOffSwitcher implements Commander {
    private InternetOfThings internetOfThings;

    public MachineOffSwitcher(InternetOfThings internetOfThings) {
        this.internetOfThings = internetOfThings;
    }

    @Override
    public String execute() {
        return internetOfThings.setOff();
    }
}
