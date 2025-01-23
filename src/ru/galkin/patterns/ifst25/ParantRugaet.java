package ru.galkin.patterns.ifst25;

public class ParantRugaet extends CommandManager {

    public ParantRugaet(String text) {
        super(text);
    }

    @Override
    public void make(int mark) {
        System.out.println(getText() + "\n" + "Оценка : " + mark);
    }
}
