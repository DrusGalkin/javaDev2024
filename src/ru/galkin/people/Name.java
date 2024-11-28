package ru.galkin.people;

public class Name {
    private String name;
    private String familia;
    private String patronomyc;

    public Name(String familia, String name, String patronomyc) {
        if (name == null || familia == null || patronomyc == null) {
            throw new IllegalArgumentException("ПРоблемс...........");
        }

        this.familia = familia;
        this.name = name;
        this.patronomyc = patronomyc;
    }

    public Name(String name) {
        this.name = name;
        this.familia = "";
        this.patronomyc = "";
    }

    public Name(String name, String familia) {
        this.name = name;
        this.familia = familia;
        this.patronomyc = "";
    }

    public String getName() {
        return name;
    }

    public String getFamilia() {
        return familia;
    }

    public String getPatronomyc() {
        return patronomyc;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public void setPatronomyc(String patronomyc) {
        this.patronomyc = patronomyc;
    }

    @Override
    public String toString() {
        return familia + " " + name + " " + patronomyc;
    }
}