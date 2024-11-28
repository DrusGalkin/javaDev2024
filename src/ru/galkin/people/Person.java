package ru.galkin.people;

public class Person {
    private String name;
    private int height;
    private Person papa;

    public Person(String name, int height) {
        if(height < 0 || height > 500)
            throw new IllegalArgumentException("Ошибка роста!!!!");
        this.name = name;
        this.height = height;
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int height, Person papa) {
        if(height < 0 || height > 500)
            throw new IllegalArgumentException("Ошибка роста!!!!");

        this.name = name;
        this.height = height;
        this.papa = papa;
    }

    public Person(Name name, int height) {
        if(height < 0 || height > 500)
            throw new IllegalArgumentException("Ошибка роста!!!!");

        this.name = name.getName();
        this.height = height;
    }

    public String getName(){
        return this.name;
    }

    public Person(Name name, int height, Person papa) {
        if(height < 0 || height > 500)
            throw new IllegalArgumentException("Ошибка роста!!!!");

        if (name.getFamilia().isEmpty()) name.setFamilia(papa.name);
        if (name.getPatronomyc().isEmpty()) name.setPatronomyc(papa.name + "ович");

        this.name = name.getName();
        this.height = height;
        this.papa = papa;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height){
        if(height < 0 || height > 500)
            throw new IllegalArgumentException("Ошибка роста!!!!");

        this.height = height;
    }

    @Override
    public String toString() {
        if(height == 0) return name;

        if (papa != null) {
            return name + " " + papa.name + "ович " + height + ", Отец - " + papa.name;
        }
        return name + ", " + height;
    }
}