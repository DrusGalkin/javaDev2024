package ru.galkin.other;

import ru.galkin.animals.Meow;

public class CounterMeow implements Meow {
    Meow m;
    int count = 0;

    public CounterMeow(Meow m){
        this.m = m;
    }

    @Override
    public String song() {
        m.song();
        count++;
        return count +"";
    }
}
