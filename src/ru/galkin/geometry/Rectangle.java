package ru.galkin.geometry;

public class Rectangle extends Cube{
    private int lengthY;
    public Rectangle(Point point, int lengthX, int lengthY ) {
        super(point, lengthX);
        this.lengthY = lengthY;
    }

    public Rectangle(int x, int y, int length, int lengthY) {
        this(new Point(x, y), length, lengthY);
    }

    public void draw(){
        for(int i = 0 ; i < getLengthY(); i++){
            for(int j = 0; j < getLength(); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public Polyline getCubeFaces() {
        Point rightTop = new Point(getPoint().getX() + getLengthY(), getPoint().getY());
        Point leftBottom = new Point(getPoint().getX(), getPoint().getY() + getLength());
        Point rightBottom = new Point(getPoint().getX() + getLength(), getPoint().getY() + getLengthY());


        return new ClosedPolyline(getPoint(), rightTop, rightBottom, leftBottom);
    }

    public int getLengthY(){
        return this.lengthY;
    }

    public double square(){
        return getLength() * getLengthY();
    }
}
