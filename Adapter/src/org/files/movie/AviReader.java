package org.files.movie;

import org.files.movie.interfaces.MoviePlayer;

/**
 * Created by Robert Szczygielski on 28.11.16.
 */
public class AviReader implements MoviePlayer {
    private String file;
    private String suffix;

    @Override
    public void setToUncompress(String file) {
        this.file = file.toLowerCase();
        String[] fileSplit = file.split("\\.");
        this.suffix = fileSplit[1].toLowerCase();
    }

    @Override
    public String getRenderer() {
        return suffix;
    }
}
