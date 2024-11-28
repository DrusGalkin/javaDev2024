package ru.galkin.patterns.strategy.calculator;

public class Div implements Operation{

    public Div(int a, int b){
        execute(a,b);
    }

    @Override
    public void execute(int a, int b) {
        System.out.println(a/b + " ");
    }
}
