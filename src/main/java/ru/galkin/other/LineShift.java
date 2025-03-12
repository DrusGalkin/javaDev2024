package ru.galkin.other;

import ru.galkin.geometry.Line;
import ru.galkin.geometry.Point;
import ru.galkin.geometry.Point3D;
import ru.galkin.geometry.Shift;

public class LineShift {
    private static int SHIFT;
    private Shift shift;

    public static Line<?> shift(Line<?> line, Shift type, int shift){
        SHIFT = shift;
        return type == Shift.X ? shiftX(line) :
               type == Shift.Y ? shiftY(line) :
               type == Shift.Z ? shiftZ((Line<Point3D>) line) : line;
    }

    private static Point   X(Point point){
        int x = point.getX();
        int y = point.getY();

        if(point instanceof Point3D)
            throw new ClassCastException();
        return new Point(
                x > 0 ? x + SHIFT : x - SHIFT,
                y
        );
    }

    private static Point   Y(Point point){
        int x = point.getX();
        int y = point.getY();

        if(point instanceof Point3D)
            throw new ClassCastException();
        return new Point(
                x,
                y > 0 ? y + SHIFT : y - SHIFT
        );
    }

    private static Point3D Z(Point3D point){
        int x = point.getX();
        int y = point.getY();
        int z = point.getZ();

        return new Point3D(
                x,
                y,
                z > 0 ? z + SHIFT : z - SHIFT
        );
    }

    private static Line<?> shiftX(Line<?> line){
        Point start = line.getStart();
        Point end = line.getEnd();
        return new Line<>(X(start), X(end));
    }

    private static Line<?> shiftY(Line<?> line){
        Point start = line.getStart();
        Point end = line.getEnd();
        return new Line<>(Y(start), Y(end));
    }

    private static Line<Point3D> shiftZ(Line<Point3D> line){
        Point3D start = line.getStart();
        Point3D end = line.getEnd();
        return new Line<>(Z(start), Z(end));
    }
}