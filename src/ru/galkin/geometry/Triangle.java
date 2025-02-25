//package ru.galkin.geometry;
//
//public class Triangle extends Figure{
//    private Point point2;
//    private Point point3;
//
//    public Triangle(int num1, int num2, int num3, int num4, int num5, int num6) {
//        super(num1, num2);
//        this.point2 = new Point(num3, num4);
//        this.point3 = new Point(num5, num6);
//    }
//
//    public Triangle(Point point1, Point point2, Point point3){
//        super(point1);
//        this.point2 = point2;
//        this.point3 = point3;
//    }
//
//    private double distance(Point p1, Point p2) {
//        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
//    }
//
//    @Override
//    public void draw() {
//        int height = (int) square();
//
//        for (int i = 1; i < height; i++) {
//            for (int j = i; j < height; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k < (2 * i); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    @Override
//    public double square() {
//        double side1 = distance(getPoint(), point2);
//        double side2 = distance(point2, point3);
//        double side3 = distance(point3, getPoint());
//
//        double polPer = (side1 + side2 + side3) / 2;
//        double res = Math.sqrt(polPer * (polPer - side1) * (polPer - side2) * (polPer - side3));
//
//        return res;
//    }
//
//    @Override
//    public Polyline getPolygonalChain() {
//        return new Polyline(getPoint(), this.point2, this.point3);
//    }
//}
