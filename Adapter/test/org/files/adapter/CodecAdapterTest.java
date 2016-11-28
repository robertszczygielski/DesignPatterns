package org.files.adapter;

import org.files.audio.interfaces.MediaFiles;
import org.files.movie.interfaces.MoviePlayer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 28.11.16.
 */
@RunWith(MockitoJUnitRunner.class)
public class CodecAdapterTest {
    private final String testSuffix = "suffix";

    @Mock
    private MoviePlayer moviePlayer;

    @Before
    public  void setup() {
        Mockito.when(moviePlayer.getRenderer()).thenReturn(testSuffix);
    }

    @Test
    public void shouldReturnTestSuffixText() throws Exception {
        MediaFiles codecAdapter = new CodecAdapter(moviePlayer);
        String result = codecAdapter.getCompression();

        assertEquals(testSuffix, result);
    }
}
