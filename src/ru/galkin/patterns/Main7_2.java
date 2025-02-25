package ru.galkin.patterns;

import ru.galkin.other.DivineImplements;
import ru.galkin.patterns.adapter.StringAdd;

public class Main7_2 {
    public static void main(String...main){
        DivineImplements d = new DivineImplements();

        System.out.println(
                d.printSumNumericValue(4,3, new StringAdd("aaa"))
        );
    }
}
