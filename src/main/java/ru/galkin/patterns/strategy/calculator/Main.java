package ru.galkin.patterns.strategy.calculator;

public class Main {
    public static void main(String...args){
        Calculator c = new Calculator();

        c.mul(5,5);
        c.sub(10,5);
    }
}
