package ru.galkin.patterns.ifst23;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Student implements Iterable<Integer> {
    private String name;
    private Group group;
    private List<Integer> marks;

    public Student(String name, int...marks){
        this.name = name;
        this.marks = new ArrayList<>();
        for(Integer i : marks){
            if(i >= 2 && i <= 5) this.marks.add(i);
            else throw new RuntimeException("оценка должна быть не больше 5!1!");
        }
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        if (this.group == null) {
            this.group = group;
            group.addStudent(this);
        }
        if (!this.group.equals(group)){
            this.group.removeStudent(this);
            this.group = group;
            this.group.addStudent(this);
        }
    }

    public List<Integer> getMarks() {
        return new ArrayList<>(marks);
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return marks.iterator();
    }
}
