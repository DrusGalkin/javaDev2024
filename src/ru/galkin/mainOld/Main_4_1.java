//package ru.galkin.mainOld;
//import ru.galkin.math.*;
//import java.math.BigInteger;
//import ru.galkin.geometry.Point;
//import ru.galkin.people.*;
//
//public class Main_4_1 {
//    public static void main(String...args){
//        //3
//        BigInteger bigInt = new BigInteger("12345678912345678912");
//        Fraction f1 = new Fraction(233,12);
//        double num = 3.21;
//
//        BigInteger res = BigInteger.valueOf(f1.longValue() + (long) num);
//        res.multiply(bigInt);
//        System.out.println(res);
//
//        //4
//        MathMethods mathMethods = new MathMethods();
//        System.out.println(mathMethods.pow(args));
//
//        //5
//        Point p1 = new Point(1,5);
//        Point p2 = new Point(2,9);
//
//        java.awt.Point p3 = new java.awt.Point(3,1);
//        java.awt.Point p4 = new java.awt.Point(9,0);
//
//
//        //Пара
//
//        Department dep = new Department("IT");
//        Department dep2 = new Department("IT33");
//        Department dep3 = new Department("IT22");
//
//        dep2 = dep3;
//
//        Employee e1 = new Employee("Oleg", dep);
//        Employee e2 = new Employee("Oleg1", dep);
//        Employee e3 = new Employee("Oleg2", dep);
//        Employee e4 = new Employee("Oleg3", dep);
//
//        dep.setChief(e1);
//        System.out.println(e1);
//        System.out.println(e2);
//
//        e1 = e3;
//        e3 = e1;
//
//        dep.removeEmployee(e3);
//        System.out.println(e3);
//    }
//}
