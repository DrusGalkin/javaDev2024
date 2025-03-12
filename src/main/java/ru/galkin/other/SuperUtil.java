package ru.galkin.other;

import java.util.ArrayList;
import java.util.List;

public class SuperUtil {

    public static <T,P> List<T> util(List<T> list, SuperInterface<T,P> function){
        List<T> resultList = new ArrayList<>();
        if(list.isEmpty()) return new ArrayList<>(list);
        for (T item : list)
            resultList.add(function.apply((P) item));
        return resultList;
    }
}
