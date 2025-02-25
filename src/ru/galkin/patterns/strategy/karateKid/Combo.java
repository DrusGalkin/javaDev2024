package ru.galkin.patterns.strategy.karateKid;

import java.util.ArrayList;
import java.util.List;

public class Combo implements StrikeStrategy{
    List<StrikeStrategy> listStrike = new ArrayList<>();

    public void make(KarateKid karateKid){
        for(StrikeStrategy strikeStrategy : listStrike){
            strikeStrategy.make(karateKid);
        }
    }
}
