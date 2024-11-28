package ru.galkin.other;

import ru.galkin.animals.Meow;

public class CatAtension implements Meow {
    Meow cat;

    public CatAtension(Meow cat){
        this.cat = cat;
    }

    @Override
    public String catMayMayMay() {
        return "ВНИМАНИЕ!" + cat.catMayMayMay();
    }
}
