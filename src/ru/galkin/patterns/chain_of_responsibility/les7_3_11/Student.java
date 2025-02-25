package ru.galkin.patterns.chain_of_responsibility.les7_3_11;

public class Student extends Human{
    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
