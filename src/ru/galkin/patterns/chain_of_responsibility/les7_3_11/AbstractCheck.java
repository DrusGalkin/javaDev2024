package ru.galkin.patterns.chain_of_responsibility.les7_3_11;

public abstract class AbstractCheck<T extends Human> {
    private AbstractCheck next;

    public void hasNext(T h){
        if(this.next != null) next.check(h);
    }

    public abstract <Q extends Human> boolean check(Q h);
}
