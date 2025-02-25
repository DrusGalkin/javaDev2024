package ru.galkin.patterns.observer;

public class NewsChannel implements Channel{
    private final String name;

    public NewsChannel(String name){
        this.name = name;
    }

    @Override
    public void update(String massege) {
        System.out.printf("%s, получена новость: %s", name, massege);
    }
}
