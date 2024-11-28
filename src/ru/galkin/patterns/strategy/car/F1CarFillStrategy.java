package ru.galkin.patterns.strategy.car;

public class F1CarFillStrategy implements FillStrategy{

    @Override
    public void fill() {
        System.out.println("Фига заправил гоночный балит аааааа");
    }
}
