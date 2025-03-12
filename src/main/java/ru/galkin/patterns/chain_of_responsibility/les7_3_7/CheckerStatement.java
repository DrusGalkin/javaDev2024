package ru.galkin.patterns.chain_of_responsibility.les7_3_7;

public abstract class CheckerStatement {
    private CheckerStatement next;

    public void setCheckerStatement(CheckerStatement next) {
        this.next = next;
    }

    public void hasNext(Statement statement){
        if(this.next != null) next.check(statement);
    }

    public abstract void check(Statement statement);
}
