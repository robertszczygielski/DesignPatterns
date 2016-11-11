package org.storage.interfaces;

import org.peoples.interfaces.Observer;

/**
 * Created by Robert Szczygielski on 11.11.16.
 */
public interface Subject {
    void registerObserver(Observer observer);
    int  howManyObservers();
    void removeObserver(Observer observer);
    void notifyObservers();
}
