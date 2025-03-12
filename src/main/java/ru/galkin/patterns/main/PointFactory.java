package ru.galkin.patterns.main;

import ru.galkin.geometry.Point;
import ru.galkin.geometry.Point3D;

public class PointFactory {
    public static Point createPoint(int...cord){
        if(cord.length == 2){
            return new Point(cord[0], cord[1]);
        }
        if(cord.length == 3){
            return new Point3D(cord[0], cord[1], cord[2]);
        }
        throw new RuntimeException();
    }
}
