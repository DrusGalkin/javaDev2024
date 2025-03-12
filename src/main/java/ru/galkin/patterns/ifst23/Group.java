package ru.galkin.patterns.ifst23;

//import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Group implements Iterable<Integer> {
    private final String name;
    private final Map<String,Student> map;
    private final int count;
    private final int yearsToStart;

    public Group(String name, int count, int yearsToStart) {
        this.name = name;
        this.yearsToStart = yearsToStart;
        this.count = count;
        map = new HashMap<>();
    }

    public void addStudent(Student student){
        String key = student.getName();
        if(!map.containsKey(key)){
            if (student.getGroup() != null) student.getGroup().removeStudent(student);
            else map.put(key, student);
        }
    }

    public void removeStudent(Student student){
        String key = student.getName();
        if(map.containsKey(map) && student != null) map.remove(key);
        else throw new IllegalArgumentException("Данного студента нет в группе");
    }

    public int getCountStudent(){
        return map.size();
    }

    public String toString(){
        return    "Группа: " + this.name + " - " + this.count+", год начала обучения " + this.yearsToStart + ".\n"
                + "Количесвто человек в группе: " + getCountStudent();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return count == group.count && yearsToStart == group.yearsToStart && Objects.equals(name, group.name) && Objects.equals(map, group.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, map, count, yearsToStart);
    }

//    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return map.values().stream().map(Student::getMarks).flatMap(List::stream).iterator();
    }
}
