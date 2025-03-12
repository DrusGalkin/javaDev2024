package ru.galkin.patterns.pinf22;

import java.util.ArrayList;
import java.util.List;

public class Vagon {
    private String name;
    private List<Kupe> listKupe;
    private int price;

    public Vagon(String name, int price){
        listKupe = new ArrayList<>();
        this.name = name;
    }

    public List<Kupe> getListKupe() {
        return listKupe;
    }

    public int getPrice() {
        return price;
    }
}
