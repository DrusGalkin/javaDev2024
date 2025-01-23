package ru.galkin.patterns.chain_of_responsibility.les7_3_11;

public class Teacher extends Human{
    private int id;
    private String dol;

    public Teacher(String name, int id, String dol) {
        super(name);
        this.id = id;
        this.dol = dol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDol() {
        return dol;
    }

    public void setDol(String dol) {
        this.dol = dol;
    }
}
