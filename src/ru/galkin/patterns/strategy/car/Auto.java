package ru.galkin.patterns.strategy.car;

public abstract class Auto {
    FillStrategy fillStrategy;

    public void fill() {
        fillStrategy.fill();
    }

    public void stop(){
        System.out.println("Стоп");
    }

    public void gas(){
        System.out.println("едет");
    }
}
