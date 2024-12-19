package ru.galkin.geometry;

import java.awt.geom.Point2D;
import java.util.Objects;

public class Line<Z extends Point> implements GetLengthLineOrPolyline, PolygonalChain, Cloneable {
    private Z p1;
    private Z p2;
    private LineType lineType;

    public Line(Z p1, Z p2) {
        this.p1 = p1;
        this.p2 = p2;
        lineType = p1 instanceof Point3D ?
                lineType.LINE_3D : lineType.LINE_2D;
        System.out.println(lineType);
    }

    public static <B extends Point> Line<B> of(B p1, B p2){
        if(p1.getClass() != p2.getClass()) throw new ClassCastException("2D or 3D!");
        return new Line<>(p1,p2);
    }

    public static <S extends Point>Line<Point> of(int x1, int y1, int x2, int y2){
        return new Line<>(new Point(x1,y1), new Point(x2, y2));
    }

    public static Line<Point3D> of(int x1, int y1, int z1, int x2, int y2, int z2){
        return new Line<>(new Point3D(x1, y1, z1), new Point3D(x2, y2, z2));
    }


    public void setStart(Z point){
        if(point.getClass() != p2.getClass())
            throw new ClassCastException("2D or 3D!");
        p1 = point;
    }

    public void setEnd(Z point){
        if(point.getClass() != p1.getClass())
            throw new ClassCastException("2D or 3D!");
        p2 = point;
    }

    public Z getStart() {
        return p1;
    }

    public Z getEnd() {
        return p2;
    }

    public int getLength() {
        int dx = p1.getX() - p2.getX();
        int dy = p1.getY() - p2.getY();
        return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
    }

    public String toString() {
        return p1 + " " + p2;
    }

    @Override
    public Polyline getPolygonalChain() {
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(!(o instanceof Line)) return false;
        Line line = (Line) o;
        return this.getLength() == line.getLength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(p1, p2);
    }
}
