package ru.galkin.geometry;

public class Cube extends Figure
             implements PolygonalChain {
    private int length;
    private Polyline cubeFaces;

    public Cube(Point point, int length) {
        if (length <= 0) throw new IllegalArgumentException("Укажите корректную длинну!");
        super(point);
        this.length = length;
    }

    public Cube(int x, int y, int length) {
        this(new Point(x, y), length);
    }

    public void setLength(int length) {
        if(length <= 0) throw new IllegalArgumentException("Укажите корректную длинну!");
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public Polyline getCubeFaces() {
        Point rightTop = new Point(getPoint().getX() + length, getPoint().getY());
        Point leftBottom = new Point(getPoint().getX(), getPoint().getY() + length);
        Point rightBottom = new Point(getPoint().getX() + length, getPoint().getY() + length);

        return new ClosedPolyline(getPoint(), rightTop, rightBottom, leftBottom);
    }

    public String toString() {
        return "Квадрат в точке " + getPoint() + " со стороной " + length;
    }

    @Override
    public void draw() {
        for(int i = 0; i < square()/4; i++){
            for(int j = 0; j < square()/2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public double square() {
        return length * length;
    }

    @Override
    public Polyline getPolygonalChain() {
        return getCubeFaces();
    }
}
