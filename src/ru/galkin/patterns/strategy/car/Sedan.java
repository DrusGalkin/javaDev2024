package ru.galkin.patterns.strategy.car;

public class Sedan extends Auto{
    public Sedan() {
        this.fillStrategy = new StandartFillStrategy();
    }
}
