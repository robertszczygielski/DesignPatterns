package org.files.audio;

import org.files.audio.interfaces.MediaFiles;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 28.11.16.
 */
public class PlayerTest {
    private final String pm3File = "MUSIC.MP3";

    @Test
    public void shouldReturnFileCompressMP3AsInput() throws Exception {
        MediaFiles player = new Player();
        player.play(pm3File);

        String result = player.getCompression();

        assertEquals("mp3", result);
    }
}
