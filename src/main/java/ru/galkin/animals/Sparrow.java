package ru.galkin.animals;

public class Sparrow extends Birth {

    public Sparrow(String name){
        super(name);
    }

    public void song(){
        System.out.println("чирык");
    }
}
