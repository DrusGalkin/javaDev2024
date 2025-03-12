package ru.galkin.geometry;

public enum LineType {
    LINE_3D("3D"),
    LINE_2D("2D");

    private final String type;

    LineType(String type){
        this.type = type;
    }

    public String toString(){
        return type;
    }
}
