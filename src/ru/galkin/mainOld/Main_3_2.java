//package ru.galkin.mainOld;
//
//import ru.galkin.weapons.*;
//import ru.galkin.animals.*;
//import ru.galkin.geometry.*;
//
//public class Main_3_2 {
//    public static void main(String...args){
//        //3
//        Parrot parrot = new Parrot("Антон");
//
//        parrot.toTalk("На растроенных струнах, я пишу миру");
//        parrot.song();
//
//        Sparrow s = new Sparrow("Andrew");
//        Cuckoo cuckoo = new Cuckoo("Кукушка");
//        cuckoo.song();
//
//        System.out.println();
//
//
//        //4
//        Figure circle = new Circle(-5,5, 5);
//        circle.draw();
//        System.out.println(circle.square());
//
//        Cube square = new Cube(1,4,6);
//        square.draw();
//        System.out.println(square.getCubeFaces());
//
//        Point p1 = new Point(2,0);
//        Point p2 = new Point(-2,0);
//        Point p3 = new Point(0,6);
//
//
//
//
//        Figure triangle = new Triangle(p1,p2,p3);
//        triangle.draw();
//
//        System.out.println();
//        Figure rectangle = new Rectangle(p1, 15, 5);
//        rectangle.draw();
//
//
//        //Weapon
//        Weapon w1 = new Gun(3);
//        System.out.println(w1);
//        Weapon w2 = new Gun(3);
//        System.out.println(w1);
//
//    }
//}
