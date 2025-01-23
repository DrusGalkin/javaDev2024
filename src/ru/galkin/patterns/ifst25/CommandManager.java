package ru.galkin.patterns.ifst25;

public abstract class CommandManager implements Command {
    private Parent parent;
    private final String text;

    public CommandManager(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
    public abstract void make(int mark);
}
