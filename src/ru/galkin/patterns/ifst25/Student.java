package ru.galkin.patterns.ifst25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Student {
    private String name;
    private Gender gender;
    private Parent mother;
    private Parent father;
    private List<Integer> marks;

    public Student(String name,Gender gender,Parent mother, Parent father, int...marks){
        this.name = name;
        this.gender = gender;
        if(mother.getGender() == Gender.MAN
                || father.getGender() == Gender.WOMAN) {
            throw new RuntimeException("Запрещен однополый брак");
        }
        this.mother = mother;
        this.father = father;
        this.marks = new ArrayList<>();
        for(Integer i : marks){
            if(i >= 2 && i <= 5) this.marks.add(i);
        }
    }

    public Gender getGender() {
        return gender;
    }

    public Parent getMother() {
        return mother;
    }

    public Parent getFather() {
        return father;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return new ArrayList<>(marks);
    }
}
