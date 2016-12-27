package org.media;

import org.media.enums.MediaState;

/**
 * Created by Robert Szczygielski on 27.12.16.
 */
public class Memento {
    private MediaState state;

    public Memento(MediaState state) {
        this.state = state;
    }

    public MediaState getState() {
        return state;
    }
}
