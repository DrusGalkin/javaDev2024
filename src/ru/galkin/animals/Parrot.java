package ru.galkin.animals;

public class Parrot extends Birth {
    private String text;

    public Parrot(String name){
        super(name);
    }

    public void toTalk(String text){
        this.text = text;
    }

    public void song(){
        String text = this.text.substring(0, getRand().nextInt(this.text.length()));
        System.out.println(text + "...");
    }
}
