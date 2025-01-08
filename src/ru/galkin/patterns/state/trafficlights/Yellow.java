package ru.galkin.patterns.state.trafficlights;

public class Yellow implements Activity{
    @Override
    public Activity next() {
        System.out.println("Желтый");
        return new Green();
    }
}
