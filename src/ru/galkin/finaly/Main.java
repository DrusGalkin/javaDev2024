package ru.galkin.finaly;
import ru.galkin.people.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Bob", 2,2,2);
        Student s2 = new Student("Вован", 2,2,2);
        Student s3 = new Student("Олег", 5,5,5,5);
        Student s4 = new Student("Антон", 4,4,4,4);
        Student s5 = new Student("Алексей", 3,3,3,3);

        s.addGrades(4,4,4,4);
        s.save();
        s.addGrades(4,2,4,5,3);

        s.save();

        s2.save();
        s.addGrades(4,4,4,4);
        s.setName("Lon");
        System.out.println(s);

        System.out.println(s);


    }


}