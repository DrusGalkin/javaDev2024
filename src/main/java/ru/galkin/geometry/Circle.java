package ru.galkin.geometry;

public class Circle extends Figure{
    private int radius;

    public Circle(int num1, int num2, int radius){
        super(num1, num2);
        if(radius < 0) radius *= -1;
        this.radius = radius;
    }

    public Circle(Point point, int radius){
        super(point);
        if(radius < 0) radius *= -1;
        this.radius = radius;
    }

    public double getX(){
        return getPoint().getX() + radius * Math.cos(0);
    }

    public double getY(){
        return getPoint().getY() + radius * Math.sin(0);
    }

    public void draw() {
        int centerX = getPoint().getX();
        int centerY = getPoint().getY();

        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                double distance = Math.sqrt(Math.pow(i - centerX, 2) + Math.pow(j - centerY, 2));
                if (distance <= radius) System.out.print("****");
                else System.out.print("    ");
            }
            System.out.println();
        }
    }

    public double square(){
        return Math.PI * (radius * radius);
    }

    @Override
    public Polyline getPolygonalChain() {
        return null;
    }
}
