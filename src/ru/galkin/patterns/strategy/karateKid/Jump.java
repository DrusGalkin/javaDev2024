package ru.galkin.patterns.strategy.karateKid;

public class Jump implements StrikeStrategy{
    public void make(KarateKid karateKid){
        karateKid.jump();
    }
}
