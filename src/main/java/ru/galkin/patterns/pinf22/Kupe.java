package ru.galkin.patterns.pinf22;

import java.util.HashMap;
import java.util.Map;

public class Kupe {
    private final Map<String, Human> humans;
    private final int maxHuman;
    private KupeState kupeState;

    public Kupe(int maxHuman){
        this.maxHuman = maxHuman;
        humans = new HashMap<>(maxHuman);
    }

    public void addHuman(Human human){
        if (humans.size() >= maxHuman) {
            kupeState = KupeState.FULL;
            throw new IllegalArgumentException("Купе заполненно!");
        }
        if(humans.isEmpty() || human.getGender() == humans.values().iterator().next().getGender() && humans.size() <= maxHuman-1){
            kupeState = KupeState.NO_FULL;
            humans.put(human.getName(), human);
        }
        else throw new RuntimeException("Купе только для одного пола!");
    }

    public void removeHuman(Human human){
        String key = human.getName();
        if(humans.containsKey(key)) humans.remove(key);
        else throw new NullPointerException();
    }

    public Map<String, Human> getHumans() {
        return new HashMap<>(humans);
    }

    public String toString(){
        return "Инфо: " + kupeState.toString();
    }
}
