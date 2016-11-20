package org.animals;

import org.animals.interfaces.ToClone;

/**
 * Created by Robert Szczygielski on 20.11.16.
 */
public class Sheep implements ToClone {
    private String name;

    public Sheep() {
        this.name = "Dolly";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.identityHashCode(this));
        sb.append(";");
        sb.append(name);
        return sb.toString();
    }

    @Override
    public ToClone clone() {
        Sheep maple = null;
        try {
            maple = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return maple;
    }
}

