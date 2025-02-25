package ru.galkin.other;

import java.util.HashMap;
import java.util.Map;

public class Temperature {
    private String status;
    private int max;
    private int min;

    private static final Map<String, Temperature> instances = new HashMap<>();

    public static final Temperature COLD = createTemperature("Холодно",  -50, 10);
    public static final Temperature HOT  = createTemperature("Жарко",    25,  60);
    public static final Temperature OK   = createTemperature("Нормально",10,  25);

    private Temperature(String status,int min, int max){
        this.status = status;
        this.min = min;
        this.max = max;
    }

    public static Temperature createTemperature(String status, int min, int max){
        if(instances.containsKey(status)){
            return instances.get(status);
        }
        Temperature temperature = new Temperature(status,min, max);
        instances.put(status,temperature);
        return temperature;
    }
}
