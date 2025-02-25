package ru.galkin.patterns;

public class BuiznesProgram extends Program {
    public BuiznesProgram(Developer dev) {
        super(dev);
    }

    @Override
    void developProgram() {
        System.out.println("dev Buiznes program....");
        dev.writeCode();
    }
}
