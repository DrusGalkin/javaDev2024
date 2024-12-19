package ru.galkin.people;

import ru.galkin.other.Compare;

import java.text.DecimalFormat;
import java.util.*;

public class Student implements Cloneable, Compare<Student> {
    private String name;
    private List<Integer> grade;
    private static List<Save> history = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("#.0");

    public Student(String name, int... grades) {
        this.name = name;
        grade = new ArrayList<>();
        addGrades(grades);
    }

    public void addGrades(int... grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 0 && grades[i] < 6) grade.add(grades[i]);
            else throw new IllegalArgumentException("Используется 5ти бальная система, " + grades[i] + " не подходит.");
        }
    }

    public void removeGrade(int index) {
        grade.remove(index);
    }

    public List<Integer> getGrade() {
        return new ArrayList<>(this.grade);
    }

    public double averageScore() {
        double res = 0;
        for (int i = 0; i < getGrade().size(); i++) {
            res += getGrade().get(i);
        }
        if (getGrade().size() > 0) {
            res /= getGrade().size();
        }
        return Math.min(res, 5);
    }

    public String getName() {
        return name;
    }

    private String status(double score) {
        if (score <= 2.9) return "Двочник";
        else if (score <= 3.9) return "Троешник";
        else if (score <= 4.9) return "Ударник";
        else return "Отличник";
    }

    public Save save() {
        Save save = new Save();
        history.add(save);
        return save;
    }


    public void rollback(int index) {
        if (index < 0 || index >= history.size()) {
            System.out.println("Некорректный индекс для отката.");
            return;
        }
        Save save = history.get(index);
        save.load(this);
        history.remove(index);
    }

    public String toString() {
        return name + " - " + grade + "\n"
                + (averageScore() == 5 ? 5 : df.format(averageScore()))
                + " " + status(averageScore());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public int compare(Student student) {
        int res = (int) (averageScore() - student.averageScore());
        return Integer.compare(res, 0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Save implements PointSave<Student> {
        private String name;
        private List<Integer> grade;
        private Student student;

        public Save() {
            student = Student.this;
            this.name = Student.this.getName();
            this.grade = new ArrayList<>(Student.this.getGrade());
        }

        @Override
        public void load(Student student) {
            student.setName(this.name);
            student.grade = new ArrayList<>(this.grade);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Save save = (Save) o;
            return Objects.equals(name, save.name) && Objects.equals(grade, save.grade);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, grade);
        }

        public String toString() {
            return Student.this.getName() + "\n";
        }
    }
}