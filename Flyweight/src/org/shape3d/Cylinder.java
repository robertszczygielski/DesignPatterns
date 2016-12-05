package org.shape3d;

/**
 * Created by Robert Szczygielski on 05.12.16.
 */
public class Cylinder {
    private final String color;
    private int height;
    private int diameter;


    public Cylinder(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(color)
            .append(", H: ")
            .append(height)
            .append(", D: ")
            .append(diameter);

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cylinder cylinder = (Cylinder) o;

        if (height != cylinder.height) return false;
        if (diameter != cylinder.diameter) return false;
        return color != null ? color.equals(cylinder.color) : cylinder.color == null;

    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + height;
        result = 31 * result + diameter;
        return result;
    }
}
