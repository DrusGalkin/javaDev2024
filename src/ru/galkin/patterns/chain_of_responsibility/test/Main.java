package ru.galkin.patterns.chain_of_responsibility.test;

public class Main {
    public static void main(String...args){
        MinLimit minLimit = new MinLimit();
        MaxLimit maxLimit = new MaxLimit();
        minLimit.setNext(maxLimit);

        minLimit.check(new MoneyTransaction(12000));
    }
}
