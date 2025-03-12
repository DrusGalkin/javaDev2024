package ru.galkin.animals;

import java.util.Random;

public abstract class Birth implements BirdSounds {
    private String name;
    private Random rand;

    public Birth(String name){
        this.name = name;
        this.rand = new Random();
    }

    public Random getRand(){
        return rand;
    }

    public boolean fly(){
        return true;
    }
    public abstract void song();
}
