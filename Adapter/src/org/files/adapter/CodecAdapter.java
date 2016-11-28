package org.files.adapter;

import org.files.audio.interfaces.MediaFiles;
import org.files.movie.interfaces.MoviePlayer;

/**
 * Created by Robert Szczygielski on 28.11.16.
 */
public class CodecAdapter implements MediaFiles {
    private final MoviePlayer moviePlayer;

    public CodecAdapter(MoviePlayer moviePlayer) {
        this.moviePlayer = moviePlayer;
    }

    @Override
    public void play(String file) {
        moviePlayer.setToUncompress(file);
    }

    @Override
    public String getCompression() {
        return moviePlayer.getRenderer();
    }
}
