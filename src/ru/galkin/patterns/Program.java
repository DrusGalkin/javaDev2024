package ru.galkin.patterns;

public abstract class Program {
    protected Developer dev;

    public Program(Developer dev){
        this.dev = dev;
    }

    abstract void developProgram();
}
