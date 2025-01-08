package ru.galkin.patterns.state.trafficlights;

public class Red implements Activity{
    @Override
    public Activity next() {
        System.out.println("Красный");
        return new Yellow();
    }
}
