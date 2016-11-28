package org.files.audio;

import org.files.audio.interfaces.MediaFiles;

/**
 * Created by Robert Szczygielski on 28.11.16.
 */
public class Player implements MediaFiles {
    private String file;
    private String compression;

    @Override
    public void play(String file) {
        this.file = file.toLowerCase();
        String[] fileSplit = file.split("\\.");
        this.compression = fileSplit[1].toLowerCase();
    }

    @Override
    public String getCompression() {
        return compression;
    }
}
