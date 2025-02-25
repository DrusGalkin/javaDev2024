package ru.galkin.patterns.ifst23;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("ИФСТ", 23, 2023);
        Student student = new Student("Andrew", 3,4,4,4,4);
        Student student1 = new Student("Andrew2", 3,4,4,4,4);
        Student student2 = new Student("Andrew3", 3,4,4,4,4);
        Student student3 = new Student("Andrew4", 3,4,4,4,4);
        group.addStudent(student);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        for(Integer i : group){
            System.out.println(i);
            System.out.println("g");
        }
        System.out.println(group);
//        group.removeStudent(student);
    }
}
