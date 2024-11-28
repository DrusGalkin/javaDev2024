package ru.galkin.mainNew;

import ru.galkin.math.Fraction;

public class Main_5_2 {
    public static void main(String...args){
        Fraction f1 = new Fraction(2,4);
        Fraction f2 = f1.clone();

        f1.denominator = 10.1;

        System.out.println(f1 + "\n" + f2);
    }
}
