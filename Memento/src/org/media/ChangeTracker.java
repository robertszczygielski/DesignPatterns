package org.media;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robert Szczygielski on 27.12.16.
 */
public class ChangeTracker {
    private List<Memento> memories = new ArrayList<>();

    public void toRemember(Memento memento) {
        memories.add(memento);
    }

    public Memento getFromMemory(int index) {
        return memories.get(index);
    }
}
