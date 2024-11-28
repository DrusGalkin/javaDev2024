package ru.galkin.patterns.strategy.calculator;

public class Sum implements Operation{
    public Sum(int a, int b){
        execute(a,b);
    }

    @Override
    public void execute(int a, int b) {
        System.out.println(a+b + " ");
    }
}
