package ru.galkin.patterns.pinf22;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kassa {
    private int num;
    private final static Map<String, List<Train>> map = new HashMap<>();

    private Kassa(int num){
        this.num = num;
    }

    public static Kassa create(int num){
        return new Kassa(num);
    }

    public void buyTicket(Human human, String city, int numTrain, int numVagon, int numKupe){
        int price = map.get(city).get(numTrain).getVagonList().get(numVagon).getPrice();
        int temp = human.getMoney() - price;
        if(temp > 0){
            try{
                map.get(city).get(numTrain).getVagonList().get(numVagon).getListKupe().get(numKupe).addHuman(human);
            } catch (Exception e){
                buyTicket(human, city, numTrain, numVagon, ++numKupe);
            }
        }
    }
}
