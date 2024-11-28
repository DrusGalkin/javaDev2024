package ru.galkin.people;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Cloneable{
    private String name;
    private List<Integer> grade;
    DecimalFormat df = new DecimalFormat("#.0");

    public Student(String name, int...grades){
        this.name = name;
        grade = new ArrayList<>();
        addGrades(grades);
    }

    public void addGrades(int...grades){
        for(int i = 0; i < grades.length; i++){
            if(grades[i] > 0 && grades[i] < 6) grade.add(grades[i]);
            else throw new IllegalArgumentException("Используется 5ти бальная система, " + grades[i] + " не подходит.");
        }
    }

    public void removeGrade(int index){
        grade.remove(index);
    }

    public List<Integer> getGrade(){
        return new ArrayList<>(this.grade);
    }

    public double averageScore(){
        double res = 0;
        for(int i = 0; i < getGrade().size(); i++){
            res += getGrade().get(i);
        }
        res /= getGrade().size();
        if(res > 5) res = 5;
        return res;
    }

    private String status(double score){
        if(score <= 2 && score <= 2.9) return "Двочник";
        else if (score >= 3 && score <= 3.9) return "Троешник";
        else if (score >= 4 && score <= 4.9) return "Ударник";
        else if (score == 5) return "Отличник";
        return "";
    }

    public Student clone(){
        try{
            return (Student)super.clone();
        }catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    public String toString(){
        return name + " - " + grade + "\n"
               + (averageScore() == 5 ? 5  : df.format(averageScore()))
               + " " + status(averageScore());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(grade, student.grade) && Objects.equals(df, student.df);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, df);
    }
}
