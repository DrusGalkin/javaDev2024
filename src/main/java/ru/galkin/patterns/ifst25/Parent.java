package ru.galkin.patterns.ifst25;

import java.util.ArrayList;
import java.util.List;

public class Parent {
    private String name;
    private Gender gender;
    private Parent parent;
    private List<Student> students;
    private List<Command> commands;

    public Parent(String name, Gender gender){
        this.name = name;
        this.gender = gender;
        this.commands = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addStudent(Student...students){
        for(Student i : students){
            this.students.add(i);
        }
    }

    public String getName() {
        return name;
    }

    private int getCountMarks(){
        int count = 0;
        for(Student i : students) count += i.getMarks().size();
        return count;
    }

    void checkStudentMarks(){
        for (Command command : commands){
            command.setParent(this);
            for(int i = 0; i < getCountMarks(); i++){
                if (i == 3 || i == 2){
                    if(command instanceof ParantRugaet){
                        command.make(i);
                    }
                }
                if (i == 4 || i == 5){
                    if(command instanceof ParantHvalit){
                        command.make(i);
                    }
                }
            }
        }
    }

    public Gender getGender() {
        return gender;
    }
}
