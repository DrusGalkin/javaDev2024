package ru.galkin.patterns.state.trafficlights;

public class TrafficLights implements Activity {
    private Activity activity;

    public TrafficLights(){
        this.activity = new Red();

    }

    @Override
    public Activity next() {
        return activity.next().next();
    }
}
