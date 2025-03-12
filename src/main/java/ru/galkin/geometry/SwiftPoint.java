package ru.galkin.geometry;

public class SwiftPoint{
    private Geometryable geometryable;

    private SwiftPoint(Geometryable g){
        this.geometryable = g;

    }

    public static SwiftPoint create(Geometryable g){
        return new SwiftPoint(g);
    }

}
