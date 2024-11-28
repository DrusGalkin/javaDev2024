package ru.galkin.weapons;

public class Machine extends Gun {
    private final int rateOfFire;

    public Machine() {
        super(30);
        this.rateOfFire = 30;
    }

    public Machine(int capacity) {
        super(capacity);
        this.rateOfFire = capacity / 2;
    }

    public Machine(int rateOfFire, int capacity) {
        super(capacity);
        if (rateOfFire > 0) this.rateOfFire = rateOfFire;
        throw new IllegalArgumentException("Скорострельность должна быть положительным числом.");
    }

    public String shoot() {
        if (getCurrentBullets() < rateOfFire) {
            return "Недостаточно патронов для " + rateOfFire + " выстрелов.";
        }
        currentBullets -= rateOfFire;
        return "Выстрел! ".repeat(rateOfFire);
    }



    public String shoot(int seconds) {
        if (getCurrentBullets() < rateOfFire * seconds) {
            return "Недостаточно патронов для " + rateOfFire * seconds + " выстрелов.";
        }
        currentBullets -= rateOfFire * seconds;
        return "Выстрел! ".repeat(rateOfFire * seconds);
    }
}