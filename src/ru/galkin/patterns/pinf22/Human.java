package ru.galkin.patterns.pinf22;

public class Human {
    private String name;
    private Gender gender;
    private int money = 0;

    public Human(String name, Gender gender){
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }


    public void setMoney(int money) {
        this.money = money;
    }

    public Gender getGender() {
        return gender;
    }

    public String toString(){
        return gender == Gender.MAN ? "Мужчина" : "Женщина";
    }
}
