package ru.galkin.other;

import java.util.ArrayList;
import java.util.List;

public class List100 {
    public static <Y extends Number> void listTo100(List<Y> list){
        list.clear();
        for(int i = 0; i < 100; i++){
            list.add((Y) Integer.valueOf(i));
        }
    }
}