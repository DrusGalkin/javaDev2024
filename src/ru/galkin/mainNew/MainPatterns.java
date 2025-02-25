package ru.galkin.mainNew;

import ru.galkin.geometry.Geometryable;
import ru.galkin.geometry.Point;
import ru.galkin.geometry.SwiftPoint;

public class MainPatterns {
    public static void main(String[] args) {
        Geometryable p = new Point(4,6);
//        p = SwiftPoint.create(p).add(6,4);
        System.out.println(p);
    }
}
