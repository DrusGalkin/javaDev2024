package ru.galkin.other;

public class IntegerType implements Type<Integer>{
    @Override
    public Integer check(Integer t) {
        if(t == null) return 0;
        if(t >= 99) return -1;
        else return t;
    }
}
