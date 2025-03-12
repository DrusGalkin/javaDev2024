package ru.galkin.patterns.chain_of_responsibility.les7_3_11;

public class CheckName extends AbstractCheck<Human>{

    @Override
    public <Q extends Human> boolean check(Q h) {

        return false;
    }
}
