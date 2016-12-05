package org.factorys;

import org.shape3d.Cylinder;

import java.util.HashMap;

/**
 * Created by Robert Szczygielski on 05.12.16.
 */
public class ShapeFactory {
    private static final HashMap<String, Cylinder> shapes = new HashMap<>();

    public static Cylinder getShape(String color) {
        Cylinder cylinder = shapes.get(color);

        if(cylinder == null) {
            cylinder = new Cylinder(color);
            shapes.put(color, cylinder);
        }

        return cylinder;
    }
}
