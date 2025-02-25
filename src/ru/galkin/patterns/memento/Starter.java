package ru.galkin.patterns.memento;

public class Starter {
    public static void main(String[] args) {
        Project p = new Project();
        p.setVersionAndDate("v1.5");
        System.out.println(p);

        GitHub g = new GitHub();
        g.setSave(p.save());
        p.setVersionAndDate("v1.13");
        System.out.println(p);

        p.load(g.getSave());
        System.out.println(p);
    }
}
