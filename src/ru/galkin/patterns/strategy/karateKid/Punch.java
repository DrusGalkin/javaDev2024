package ru.galkin.patterns.strategy.karateKid;

public class Punch implements StrikeStrategy{

    public void make(KarateKid karateKid) {
        karateKid.punch();
    }
}
