package ru.galkin.geometry;

import java.util.Objects;

public class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ(){
        return z;
    }

    public String toString() {
        return "{" + getX() + " ; " + getY() + " ; " + z + "}";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Point3D point3D = (Point3D) o;
        return z == point3D.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), z);
    }
}
