package ru.galkin.geometry;

import ru.galkin.people.PointSave;

public class HashCube extends Cube{
    private Cube cube;
    private double res;

    public HashCube(Point point, int length) {
        super(point, length);
    }

    @Override
    public double square() {

        return res;
    }
}
