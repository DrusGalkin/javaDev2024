package ru.galkin.patterns.strategy.car;

public class Main {
    public static void main(String...args){
        Auto c1 = new Sedan();
        c1.fill();

        Auto f1 = new F1Car();
        f1.fill();
    }
}
