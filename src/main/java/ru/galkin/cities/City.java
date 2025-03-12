package ru.galkin.cities;

import ru.galkin.geometry.Polyline;

import java.util.*;

public class City {
    private String name;
    private List<Ways> ways = new ArrayList<>();

    public City(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public List<Ways> getWays(){
        return new ArrayList<>(ways);
    }

    public void putWays(City city, int cost){
        for(int i = 0; i < ways.size(); i++){
            if(ways.get(i).toDo() == city) {
                ways.get(i).cost = cost;
                return;
            }
        }
        ways.add(new Ways(city, cost));
    }

    public void removeWays(City city){
        for(int i = 0; i < ways.size(); i++){
            if(ways.get(i).toDo() == city) ways.remove(i);
        }
    }

    public boolean checkToDo(City city) {
        for (Ways way : ways) {
            if (way.toDo() == city)  return true;
        }
        return false;
    }

    public String toString(){
        return name + "\n \\ \n" + ways;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City cites) ) return false;
        List<Ways> waysThat = getWays();
        List<Ways> waysOther = cites.getWays();

        Collections.sort(waysThat);
        Collections.sort(waysOther);

        return Objects.equals(waysThat, waysOther);
    }

    @Override
    public int hashCode() {
        List<Ways> waysThat = getWays();
        Collections.sort(waysThat);
        return Objects.hash(waysThat);
    }
}
