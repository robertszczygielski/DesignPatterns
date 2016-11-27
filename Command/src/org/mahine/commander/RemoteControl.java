package org.mahine.commander;

import org.mahine.commander.interfaces.Commander;

/**
 * Created by Robert Szczygielski on 27.11.16.
 */
public class RemoteControl {
    private Commander command;

    public void setCommand(Commander command) {
        this.command = command;
    }

    public String exe() {
        return command.execute();
    }
}
