package org.media.interfaces;

import org.media.enums.MediaState;

/**
 * Created by Robert Szczygielski on 27.12.16.
 */
public interface IMedia {
    void setState(MediaState state);
    MediaState getState();
    MediaState getState(int index);
}
