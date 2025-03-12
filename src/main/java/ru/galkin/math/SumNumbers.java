package ru.galkin.math;

public class SumNumbers{

    public double res(Number... num) {
        double res = 0;
        for(int i = 0; i < num.length; i++){
            res += num[i].doubleValue();
        }
        return res;
    }
}
