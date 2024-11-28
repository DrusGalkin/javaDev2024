package ru.galkin.geometry;

public abstract class Figure implements PolygonalChain{
    private Point point;

    public Figure(int num1, int num2){
        if(num1 < 0)  num1 *= -1;
        if(num2 < 0)  num2 *= -1;

        this.point = new Point(num1, num2);
    }

    public Figure(Point point){
        if(point.getX() < 0)  point.setX(point.getX() * -1);
        if(point.getY() < 0)  point.setY(point.getX() * -1);

        this.point = point;
    }

    public Point getPoint(){
        return this.point;
    }

    public abstract void draw();
    public abstract double square();

    public String toString(){
        return "Это Фигура";
    }
}