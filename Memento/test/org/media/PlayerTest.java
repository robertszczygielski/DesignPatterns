package org.media;

import org.junit.Before;
import org.junit.Test;
import org.media.enums.MediaState;
import org.media.interfaces.IMedia;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 27.12.16.
 */
public class PlayerTest {

    private IMedia media;

    @Before
    public void setup() {
        media = new MediaImpl();
    }

    @Test
    public void shouldSetAndReturnCurrentState() throws Exception {
        media.setState(MediaState.STOP);
        MediaState result = media.getState();

        assertEquals(result, MediaState.STOP);
    }

    @Test
    public void shouldChangeTheStateAndShowTheFirstState() throws Exception {
        media.setState(MediaState.STOP);
        media.setState(MediaState.START);
        MediaState result = media.getState(1);

        assertEquals(result, MediaState.STOP);
    }
}
