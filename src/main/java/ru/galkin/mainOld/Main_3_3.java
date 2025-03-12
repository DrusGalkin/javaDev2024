//package ru.galkin.mainOld;
//import ru.galkin.cities.*;
//import ru.galkin.math.*;
//import ru.galkin.other.*;
//import ru.galkin.animals.*;
//import ru.galkin.weapons.*;
//import ru.galkin.geometry.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main_3_3 {
//
//    public static void main(String...args){
//        DivineImplements divineImp = new DivineImplements();
//
//        //1
//        Fraction f1 = new Fraction(3,5);
//        Integer num1 = 4;
//        Integer num2 = 10;
//
//        System.out.println(divineImp.printSumNumericValue(num1,num2,f1) + "\n");
//
//        //2
//        Cuckoo cuckoo = new Cuckoo("Кукушка");
//        Sparrow sparrow = new Sparrow("Воробей");
//        Parrot parrot = new Parrot("Попуг");
//        parrot.toTalk("Попробуй эти вкусные французкие булки");
//
//        divineImp.priteBirdSounds(
//                cuckoo,sparrow,parrot
//        );
//
//        //3
//        Figure circle = new Circle(10, 10, 7);
//        Figure cube = new Cube(7,-1, 6);
//        Figure square = new Rectangle(8,9,7, 10);
//        Figure triangle = new Triangle(3,4,7,12,9,4);
//
//        System.out.println(
//                divineImp.sumFigure(circle,cube,square,triangle)
//        );
//
//        //4
//        Cat cat1 = new Cat("Олег");
//        Cat cat2 = new Cat("Вован");
//        Cat cat3 = new Cat("кот");
//        System.out.println(cat2);
//        System.out.println(cat2);
//        System.out.println(cat2);
//
//        divineImp.moreCatMeowMeow(cat1,cat2,cat3, divineImp);
//
//        //5
//        // смотреть в СВЯТОМ ИМПЛЕМЕНТЕ!!!1!1!
//
//        //7
//        Line l = new Line(3,4,5,3);
//
//        System.out.println(
//                divineImp.omgPolyline(cube,triangle,l)
//        );
//
//        //8
//        Weapon weapon1 = new Gun(6);
//        Weapon weapon2 = new Machine(10);
//
//        Shooter s1 = new Shooter("Олег1");
//        Shooter s2 = new Shooter("Олег2", weapon1);
//        Shooter s3 = new Shooter("Олег3", weapon2);
//
//                s1.fire();
//                s2.fire();
//                s3.fire();
//
//        //9
//        City a = new CityOneToOne("А");
//        City b = new City("B");
//        City c = new CityOneToOne("C");
//        City d = new CityOneToOne("D");
//        City e = new City("E");
//
//        a.putWays(c, 0);
//        a.putWays(b, 0);
//
//        b.putWays(c, 0);
//
//        d.putWays(b, 0);
//        d.putWays(e, 0);
//
//        e.putWays(c, 0);
//
//        List<Point> pts = new ArrayList<>();
//
//        MainTest test = new MainTest();
//        Point p1 = new Point(1,4);
//        Point p2 = new Point(7,2);
//        Point p3 = new Point(-4,-10);
//
//        pts.add(p1);
//        pts.add(p2);
//        pts.add(p3);
//
//    }
//
//}
