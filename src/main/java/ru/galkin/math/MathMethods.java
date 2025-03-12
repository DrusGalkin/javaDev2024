package ru.galkin.math;
import static java.lang.Integer.*;

public class MathMethods {

    public int pow(String...args){
        int x;
        int y;

        if(args.length > 2) throw new IllegalArgumentException("В точку входа программы, должно вводится всего 2 числа");
        else {
           x = parseInt(args[0]);
           y = parseInt(args[1]);
        }

        return (int) Math.pow(x,y);
    }
}
