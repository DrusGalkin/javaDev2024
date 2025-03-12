package ru.galkin.patterns.chain_of_responsibility.test;

public class MinLimit extends AbstractCheck{
    @Override
    public void check(MoneyTransaction moneyTransaction) {
        if(moneyTransaction.getTransaction() > 2000){
            System.out.println("Введите пин-код");
        }
        checkNext(moneyTransaction);
    }
}
