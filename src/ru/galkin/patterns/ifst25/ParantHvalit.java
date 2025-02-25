package ru.galkin.patterns.ifst25;

public class ParantHvalit extends CommandManager{
    public ParantHvalit(String text) {
        super(text);
    }

    @Override
    public void make(int mark) {
        System.out.println(getText() + "\n" + "Оценка : " + mark);
    }
}
