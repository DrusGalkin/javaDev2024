package ru.galkin.patterns.proxy;

import ru.galkin.animals.Meow;

public class MeowCounter implements Meow {
    private Meow meow;
    private int count;

    public MeowCounter(Meow meow){
        this.meow = meow;
    }

    @Override
    public String song() {
        System.out.println(++count);
        return this.meow.song();
    }
}
