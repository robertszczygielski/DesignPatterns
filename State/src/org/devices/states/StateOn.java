package org.devices.states;

import org.devices.Tv;
import org.devices.states.interfaces.TvState;

/**
 * Created by Robert Szczygielski on 07.12.16.
 */
public class StateOn implements TvState {
    private Tv tv;

    public StateOn(Tv tv) {
        this.tv = tv;
    }

    @Override
    public String stateName() {
        return "Tv is on";
    }
}
