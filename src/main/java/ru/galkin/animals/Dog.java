package ru.galkin.animals;

public class Dog implements Meow{
    private final String name;

    public Dog(String name){
        this.name = name;
    }

    public String toString(){
        return "Собака: " + name;
    }

    @Override
    public String song() {
        return "гав";
    }
}
