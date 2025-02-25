package ru.galkin.patterns.main;

import ru.galkin.math.Fraction;

public class Main7_1 {
    public static void main(String...args){
        Fraction.Factory factory = Fraction.Factory.getInstance();

        Fraction f1 = factory.createFraction(4,3);
        Fraction f2 = factory.createFraction(1,9);
        Fraction f3 = factory.createFraction(41,7);

        Fraction f11 = factory.createFraction(4,3);

        System.out.println(f11.hashCode() == f1.hashCode());

        DataBase a = DataBase.create(10);
        ConnectManager manager = ConnectManager.build(a);

        manager.addConnect(new Connect("1"));
        manager.addConnect(new Connect("12"));
        manager.addConnect(new Connect("13"));
        manager.addConnect(new Connect("14"));
        manager.addConnect(new Connect("15"));
        manager.addConnect(new Connect("16"));
        manager.addConnect(new Connect("17"));
        manager.addConnect(new Connect("18"));
        manager.addConnect(new Connect("19"));
        manager.addConnect(new Connect("100"));


    }
}
