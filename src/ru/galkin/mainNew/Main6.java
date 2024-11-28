package ru.galkin.mainNew;

import ru.galkin.other.Box;
import ru.galkin.other.IntegerType;
import ru.galkin.other.Storage;
import ru.galkin.other.Type;

import java.util.Optional;

public class Main6 {
    public static void main(String[] args){
        Box<Integer> box = new Box<>(3);
        System.out.println( box.getItem());
        System.out.println(box);

        Integer a = null;
        String b = null;

        Storage<Integer> storage2 = new Storage<>(67);
    }
}
