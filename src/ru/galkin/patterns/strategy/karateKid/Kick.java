package ru.galkin.patterns.strategy.karateKid;

public class Kick implements StrikeStrategy{
    KarateKid kick;
    @Override
    public void make(KarateKid karateKid) {
       karateKid.kick();
    }
}
