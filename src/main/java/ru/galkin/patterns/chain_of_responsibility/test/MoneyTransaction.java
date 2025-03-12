package ru.galkin.patterns.chain_of_responsibility.test;

public class MoneyTransaction {
    private int transaction;

    public MoneyTransaction(int transaction) {
        this.transaction = transaction;
    }

    public int getTransaction() {
        return transaction;
    }
}
