//package ru.galkin.mainNew;
//import ru.galkin.cities.City;
//import ru.galkin.cities.CityOneToOne;
//import ru.galkin.geometry.*;
//import ru.galkin.math.Fraction;
//import ru.galkin.people.Student;
//
//public class Main5_1 {
//    public static void main(String...args){
//        //1
//        Fraction f = new Fraction(100,200);
//        Fraction f1 = new Fraction(10,20);
//        Fraction f2 = new Fraction(100,200);
//        System.out.println(f.equals(f2));
//
//        System.out.println(f.hashCode());
//        System.out.println(f1.hashCode());
//
//        //2
//        Point p1 = new Point(1,2);
//        Point p2 = new Point(1,2);
//        Point3D p3 = new Point3D(1,2, 3);
//
//        System.out.println(p1.equals(p3));
//        System.out.println(p1.hashCode() + " - " + p2.hashCode());
//
//        //3
//        Line l1 = new Line(new Point(1,2), new Point(3, 4));
//        Line l2 = new Line(new Point(1,2), new Point(3, 4));
//        Line l3 = new Line(new Point(3,4), new Point(1,2));
//
//        System.out.println(l3.equals(l1));
//
//        //4
//        Polyline pl = new Polyline(new Point(1,2),
//                                    new Point(3,4),
//                                    new Point(7,8));
//
//        ClosedPolyline cpl = new ClosedPolyline(new Point(1,1),
//                                                new Point(1,1),
//                                                new Point(1,1));
//
//        Polyline pl2 = new Polyline(new Point(1,1),
//                                    new Point(1,1),
//                                    new Point(1,1),
//                                    new Point(1,1));
//
//        System.out.println(cpl.equals(pl2));
//
//        //5
//        City A = new City("A")
//            ,B = new City("B")
//            ,C = new City("C")
//            ,D = new City("D");
//
//        CityOneToOne N = new CityOneToOne("D");
//
//        N.putWays(C, 2);
//        N.putWays(D, 1);
//
//        B.putWays(C, 2);
//        B.putWays(D, 1);
//
//        System.out.println(A.checkToDo(D) + " ffff");
//
//        System.out.println(B.equals(N));
//
//        //6
//        Student s1 = new Student("Андрей", 5,5,5,5,5), s2 = s1.clone();
//        s1.addGrades(2,2);
//        System.out.println(s1 + "\n" + s2);
//    }
//}
