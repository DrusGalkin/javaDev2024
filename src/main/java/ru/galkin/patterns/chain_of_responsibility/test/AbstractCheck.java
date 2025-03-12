package ru.galkin.patterns.chain_of_responsibility.test;

public abstract class AbstractCheck {
    private AbstractCheck next;

    public void checkNext(MoneyTransaction moneyTransaction){
        if(this.next != null) next.check(moneyTransaction);
    }

    public void setNext(AbstractCheck next) {
        this.next = next;
    }

    public abstract void check(MoneyTransaction moneyTransaction);
}
