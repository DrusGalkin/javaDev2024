package ru.galkin.patterns.strategy.calculator;

public class Mul implements Operation{

    public Mul(int a, int b){
        execute(a,b);
    }
    @Override
    public void execute(int a, int b) {
        System.out.print(a*b + " ");
    }
}
