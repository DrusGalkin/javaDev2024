package ru.galkin.patterns.adapter;

public class StringAdd extends Number {
    private int res;

    public StringAdd(String s){
        this.res = s.length();
    }

    @Override
    public int intValue() {
        return res;
    }

    @Override
    public long longValue() {
        return res;
    }

    @Override
    public float floatValue() {
        return (float) res;
    }

    @Override
    public double doubleValue() {
        return (double) res;
    }
}
