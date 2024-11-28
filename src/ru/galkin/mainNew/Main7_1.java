package ru.galkin.mainNew;

import ru.galkin.animals.Cat;
import ru.galkin.animals.Meow;
import ru.galkin.other.CatAtension;
import ru.galkin.other.CounterMeow;

public class Main7_1 {
    public static void main(String...args){
        Cat cat = new Cat("Ваталий");
        CounterMeow counterMeow = new CounterMeow(cat);
        System.out.println(counterMeow.catMayMayMay());

        CatAtension catAtension = new CatAtension(cat);

        test(catAtension,counterMeow);

        System.out.println(catAtension.catMayMayMay());
 }

 public static void test(CatAtension c, CounterMeow c2){
     System.out.println(c.catMayMayMay());
     System.out.println(c2.catMayMayMay());
 }
}
