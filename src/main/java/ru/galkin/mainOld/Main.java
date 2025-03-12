package ru.galkin.mainOld;
import ru.galkin.people.*;
import ru.galkin.math.*;
public class Main {
	public static void main(String[] args) {
		
//		ru.galkin.geometry.Point p1 = new ru.galkin.geometry.Point(1,5);
//		ru.galkin.geometry.Point p2 = new ru.galkin.geometry.Point(2,4);
//		ru.galkin.geometry.Point p3 = new ru.galkin.geometry.Point(12,56);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
		
		
		Person pers1 = new Person("Олег", 182);
		System.out.println(pers1);
		
		Name n1 = new Name("Сидоров","Виктор", "");
		System.out.println(n1);
		
		Person pers2 = new Person("Андрей", 186,pers1);
		System.out.println(pers2);
		
		
		Person pers3 = new Person(n1, 167);
		System.out.println(pers3);
		
		Person pers4 = new Person(n1, 167, pers1);
		System.out.println(pers4);
		
		
		
		
		TimeSecond s1 = new TimeSecond(3600);
		System.out.println(s1);
		
		TimeSecond s2 = new TimeSecond(3,54,213);
		System.out.println(s2);
		
		Home h1 = new Home(10);
		System.out.println(h1);
	}
}
