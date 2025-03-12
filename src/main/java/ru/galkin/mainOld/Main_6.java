//package ru.galkin.mainOld;
//import ru.galkin.math.*;
//import ru.galkin.people.*;
//import ru.galkin.geometry.Cube;
//import ru.galkin.geometry.Line;
//import ru.galkin.geometry.Point;
//
//public class Main_6 {
//    public static void main(String[] args) {
//        //1.6.1
//        TimeSecond time = new TimeSecond(160);
//        System.out.println(time);
//
//        //1.6.3
//        Point p1 = new Point(2,4);
//        Cube cube = new Cube(p1, 23);
//        cube.setLength(43);
//        System.out.println(cube);
//
//        //1.6.5
////        ru.galkin.weapons.Gun gun = new ru.galkin.weapons.Gun(7);
////        gun.setRechargeGun(3);
////
////        System.out.print(gun + ", " +gun + ", " +gun + ", " +gun + ", " +gun + ", ");
////        gun.setRechargeGun(8);
////        System.out.print(gun + ", " + gun + ", ");
////        gun.dischargeGun();
////        System.out.print(gun);
//
//        //1.6.6
//        System.out.println();
//        Point point1 = new Point(1,3);
//        Point point2 = new Point(5,9);
//
//        Line line = new Line(point1, point2);
//        System.out.println(line);
//
//        line.setStart(4,8);
//        line.setEnd(9,10);
//
////        System.out.println(line.lineLength(line));
//
//
//        System.out.println("Начало и конец: " + line.getStart() + " " + line.getEnd());
//        System.out.println(line);
//
//        //1.6.8
//        System.out.println();
//        Person pers = new Person("Andrew", 143);
//        pers.setHeight(323);
//        System.out.println(pers);
//
//        //1.6.9
//        System.out.println();
//        Student student = new Student("Василий", 5,5,5,5,1000,100001,213123,12312,12312312,123123,123123,123123,123123);
//        System.out.println(student);
//    }
//}
