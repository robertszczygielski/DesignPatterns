package org.animals;

import org.animals.interfaces.ToClone;

/**
 * Created by Robert Szczygielski on 20.11.16.
 */
public class Wolf implements ToClone {
    private String name;

    public Wolf() {
        this.name = "Big Bad Wolf";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.identityHashCode(this.hashCode()));
        sb.append(";");
        sb.append(name);

        return sb.toString();
    }

    @Override
    public ToClone clone() {
        Wolf maple = null;
        try {
            maple = (Wolf) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return maple;
    }
}
