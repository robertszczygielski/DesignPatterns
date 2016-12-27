package org.media;

import org.media.enums.MediaState;
import org.media.interfaces.IMedia;

/**
 * Created by Robert Szczygielski on 27.12.16.
 */
public class MediaImpl implements IMedia {
    private MediaState state;
    private ChangeTracker changeTracker;

    public MediaImpl() {
        changeTracker = new ChangeTracker();
    }

    @Override
    public void setState(MediaState state) {
        changeTracker.toRemember(new Memento(state));
        this.state = state;
    }

    @Override
    public MediaState getState() {
        return state;
    }

    @Override
    public MediaState getState(int index) {
        Memento memento = changeTracker.getFromMemory(index - 1);
        return memento.getState();
    }
}
