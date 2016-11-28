package org.files.movie;

import org.junit.Test;
import org.files.movie.interfaces.MoviePlayer;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 28.11.16.
 */
public class DvdPlayerTest {
    private final String dvdFile = "file.DVD";

    @Test
    public void shouldReturnDVDAsInput() throws Exception {
        MoviePlayer dvdReader = new DvdReader();
        dvdReader.setToUncompress(dvdFile);

        String result = dvdReader.getRenderer();

        assertEquals("dvd", result);
    }
}
