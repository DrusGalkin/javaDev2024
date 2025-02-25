//package ru.galkin.mainOld;
//
//import ru.galkin.animals.*;
//import ru.galkin.weapons.*;
//import ru.galkin.math.*;
//import ru.galkin.people.*;
//import ru.galkin.geometry.Line;
//import ru.galkin.geometry.Point;
//
//public class Main_5 {
//	public static void main (String[] args)
//	{
//		//1.5.1
//		Gun gun = new Gun(3);
//		System.out.println(gun +" " + gun+" " + gun +" "+ gun +" "+ gun);
//
//		//1.5.2
//		Cat cat = new Cat("Серега");
//		System.out.println();
//		System.out.println(cat);
//		System.out.println(cat);
//		System.out.println(cat);
//
//		//1.5.3
//		System.out.println();
//		Point p1 = new Point(1,5);
//		Point p2 = new Point(5,4);
//
//		Line line1 = new Line(p1,p2);
//		System.out.print(line1);
////		System.out.print(" - " + line1.lineLength(line1) + "\n");
//
//		//1.5.4
//		System.out.println();
//		TimeSecond time = new TimeSecond(34056);
//
//		System.out.println(time.getHour(34056));
//		System.out.println(time.getMints(4532));
//		System.out.println(time.getSecond(123));
//
//		//1.5.5
//		System.out.println();
//		Fraction f1 = new Fraction(3,4);
//		Fraction f2 = new Fraction(2,4);
//		Fraction f3 = new Fraction(1,2);
//
//
//		System.out.println(f1.plus(f2).divide(f2).minus(5));
//
//
//		//1.5.6
//		System.out.println();
//		Student s1 = new Student("Вася",3,4,5,4);
//		Student s2 = new Student("Петя",5,5,5,5,5);
//		Student s3 = new Student("Катя",3,3,3,3,3);
//
//		System.out.println(s1 + "\n");
//		System.out.println(s2 + "\n");
//		System.out.println(s3 + "\n");
//
//		//1.5.7
//		System.out.println();
//		Point point1 = new Point(1,5);
//		Point point2 = new Point(2,8);
//		Point point3 = new Point(5,3);
//
////		ru.galkin.geometry.Polyline pl1 = new ru.galkin.geometry.Polyline(point1, point2, point3);
////
////		System.out.println(pl1);
////
////		pl1.pushPoints(point1, point2);
////		System.out.println(pl1);
////
////		//1.5.8
////		ru.galkin.geometry.Cube cube = new ru.galkin.geometry.Cube(new ru.galkin.geometry.Point(5,3), 23);
////
////		ru.galkin.geometry.Polyline pl = cube.getCubeFaces();
////		System.out.println(pl);
////
////		pl.arr[pl.arr.length - 1] = new ru.galkin.geometry.Point(15,25);
////		System.out.println(pl);
//
//
//	}
//}
