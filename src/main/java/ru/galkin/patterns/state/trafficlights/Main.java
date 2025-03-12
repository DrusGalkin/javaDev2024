package ru.galkin.patterns.state.trafficlights;

public class Main {
    public static void main(String[] args) {
        TrafficLights trafficLights = new TrafficLights();
        trafficLights.next();
        trafficLights.next();
        trafficLights.next();
    }
}
