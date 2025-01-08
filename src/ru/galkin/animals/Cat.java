package ru.galkin.animals;

public class Cat implements Meow{
    String name;
    int count;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
        this.count = 0;
    }

    public String song() {
        return "Мяу";
    }

    public String toString() {
        ++count;
        if (name == null) return "Мяу";
        return name + " : " + song();
    }
}
