package org.devices;

import org.devices.states.StateOff;
import org.devices.states.StateOn;
import org.devices.states.interfaces.TvState;

/**
 * Created by Robert Szczygielski on 07.12.16.
 */
public class Tv {
    private TvState stateOn;
    private TvState stateOff;
    private TvState currentState;

    public Tv() {
        stateOn = new StateOn(this);
        stateOff = new StateOff(this);

        currentState = stateOff;
    }

    public void on() {
        currentState = stateOn;
    }

    public void off() {
        currentState = stateOff;
    }

    public TvState getState() {
        return currentState;
    }
}
