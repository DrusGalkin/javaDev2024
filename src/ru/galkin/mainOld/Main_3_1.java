//package ru.galkin.mainOld;
//import ru.galkin.cities.*;
//
//import ru.galkin.geometry.ClosedPolyline;
//import ru.galkin.geometry.Point;
//
//public class Main_3_1 {
//    public static void main(String...args){
//
//        System.out.println("№2");
//        Point p1 = new Point(3,5);
//        Point p2 = new Point(5,5);
//        Point p3 = new Point(10,5);
//
//        ClosedPolyline p = new ClosedPolyline(p1,p2,p3);
//
//        System.out.println(p);
//
//        System.out.println("№3");
//        CityOneToOne A = new CityOneToOne("A");
//        CityOneToOne B = new CityOneToOne("B");
//        CityOneToOne C = new CityOneToOne("C");
//        CityOneToOne D = new CityOneToOne("D");
//
//        A.putWays(B, 5);
//        A.putWays(C, 3);
//        A.putWays(D, 1);
//
//        A.removeWays(C);
//
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(C);
//        System.out.println(D);
//
//        System.out.println("№4");
//    }
//}
