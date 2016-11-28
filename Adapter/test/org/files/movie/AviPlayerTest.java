package org.files.movie;

import org.junit.Test;
import org.files.movie.interfaces.MoviePlayer;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 28.11.16.
 */
public class AviPlayerTest {
    private final String aviFile = "file.aVi";

    @Test
    public void shouldReturnDVDAsInput() throws Exception {
        MoviePlayer aviReader = new AviReader();
        aviReader.setToUncompress(aviFile);

        String result = aviReader.getRenderer();

        assertEquals("avi", result);
    }
}
