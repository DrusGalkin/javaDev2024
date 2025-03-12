package ru.galkin.patterns.state.trafficlights;

public class Green implements Activity{
    @Override
    public Activity next() {
        System.out.println("Зеленый");
        return new Red();
    }
}
