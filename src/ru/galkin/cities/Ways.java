package ru.galkin.cities;

import java.util.Objects;

public class Ways implements Comparable<Ways>{
    private City city;
    int cost;

    public Ways(City city, int cost){
        this.city = city;
        this.cost = cost;
    }

    public City toDo(){
        return city;
    }

    public int getCost() {
        return cost;
    }

    public String toString(){
        return city.getName() + " - " + cost + "$";
    }

    @Override
    public int compareTo(Ways other) {
        return city.getName().compareTo(other.city.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Ways)) return false;
        Ways other = (Ways) obj;
        return Objects.equals(this.toDo(), other.toDo()) && this.cost == other.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(toDo(), cost);
    }
}