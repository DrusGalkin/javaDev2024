package ru.galkin.animals;

public class CatDog implements Meow{
    private Cat cat;
    private Dog dog;

    public CatDog(Cat cat, Dog dog){
        this.cat = cat;
        this.dog = dog;
    }

    @Override
    public String song() {
        return cat.song() + " " + dog.song();
    }
}
