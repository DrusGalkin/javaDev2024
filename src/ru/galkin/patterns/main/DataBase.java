package ru.galkin.patterns.main;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private final List<String> list = new ArrayList<>(List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"));
    private static DataBase instance;
    private int num;

    private DataBase(int num) {
        this.num = num;
    }

    public static DataBase create(int num){
        if(instance == null) instance = new DataBase(num);
        return instance;
    }

    public int getNum() {
        return num;
    }

    protected List<String> getList() {
        return list;
    }
}
