package ru.galkin.geometry;

public enum Shift {
    X("X"),
    Y("Y"),
    Z("Z");

    public String type;

    Shift(String type){
        this.type = type;
    }

    public String toString(){
        return String.valueOf(type);
    }
}
