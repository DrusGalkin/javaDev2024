package ru.galkin.patterns.pinf22;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Vagon> vagonList;
    private String name;
    private int maxVagion;

    public Train(String name, int maxVagon){
        this.name = name;
        this.maxVagion = maxVagon;
        vagonList = new ArrayList<>();
    }

    public void addVagon(Vagon vagon){
        if(vagonList.size() >= maxVagion || vagon == null) throw new ArrayIndexOutOfBoundsException();
        vagonList.add(vagon);
    }

    public List<Vagon> getVagonList() {
        return new ArrayList<>(vagonList);
    }
}
