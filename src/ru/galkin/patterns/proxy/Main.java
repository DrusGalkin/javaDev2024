package ru.galkin.patterns.proxy;

import ru.galkin.animals.Dog;
import ru.galkin.animals.Meow;

public class Main {
    public static void main(String[] args) {
        Meow v = new MeowCounter(new Dog("ff"));

        System.out.println(v.song());
        System.out.println(v.song());
        System.out.println(v.song());
        System.out.println(v.song());
        System.out.println(v.song());
        System.out.println(v.song());
    }
}
