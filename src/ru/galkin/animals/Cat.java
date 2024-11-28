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

    public String catMayMayMay() {
        String res = "";
        for (int i = 0; i < count; i++) {
            if (count > 0) res += "мяу";
            if (i == count - 1) res += "!";
            else res += ", ";
        }
        return res;
    }

    public String toString() {
        ++count;
        if (name == null) return "Мяу";
        return name + " : " + catMayMayMay();
    }
}
