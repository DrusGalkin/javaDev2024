package ru.galkin.patterns.strategy.calculator;

public class Calculator {
    Operation operation;

    public void mul(int a, int b){
        operation = new Mul(a,b);
    }

    public void sum(int a, int b){
        operation = new Sum(a,b);
    }

    public void sub(int a, int b){
        operation = new Sub(a,b);
    }
}
