package ru.galkin.patterns.ifst24;

import ru.galkin.other.Compare;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HumanExtra implements Compare<Human> {
    private Human human;
    private static final Map<String, Integer> mapName = new HashMap<>();

    private HumanExtra(Human human){
        this.human = human;
        String key = human.getName();
        if(!mapName.containsKey(key)) {
            mapName.put(key, 0);
        }
    }

    public static HumanExtra of(Human human){
        if(human != null){
            setMapKey();
            return new HumanExtra(human);
        } throw new IllegalArgumentException();
    }

    private static HumanExtra setMapKey(){
        if(mapName.isEmpty()){
            Iterator<String> keyIterator = (Iterator<String>) Human.getMap().keySet().iterator();
            while (keyIterator.hasNext()){
                mapName.put(keyIterator.next(), 0);
            }
            System.out.println(mapName);
        }
        System.out.println(mapName);
        return null;
    }

    @Override
    public int compare(Human o) {
        int temp = mapName.get(o.getName());
        mapName.put(o.getName(), ++temp);
        return o.getName().compareTo(this.human.getName());
    }
}
