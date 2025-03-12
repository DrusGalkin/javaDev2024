package ru.galkin.patterns.strategy.car;

public class F1Car extends Auto{
    public F1Car(){
        fillStrategy = new F1CarFillStrategy();
    }
}
