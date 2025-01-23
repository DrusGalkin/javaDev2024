package ru.galkin.patterns.chain_of_responsibility.test;

public class MaxLimit extends AbstractCheck{
    @Override
    public void check(MoneyTransaction moneyTransaction) {
        if(moneyTransaction.getTransaction() > 11000)
            System.out.println("Привышен лимит транзакции");
    }
}
