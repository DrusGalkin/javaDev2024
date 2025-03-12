package ru.galkin.patterns.ifst25;

public interface Command {
    void make(int mark);
    void setParent(Parent parent);
}
