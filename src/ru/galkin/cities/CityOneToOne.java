package ru.galkin.cities;

public class CityOneToOne extends City{
    public CityOneToOne(String name) {
        super(name);
    }

    public void putWays(City city, int cost){
        super.putWays(city, cost);
        if (!city.checkToDo(this)) {
            city.putWays(this, cost);
        }
    }

    public void removeWays(City city){
        super.removeWays(city);
        if (city.checkToDo(this)) {
            city.removeWays(this);
        }
    }
}
