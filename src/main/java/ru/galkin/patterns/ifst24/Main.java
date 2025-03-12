package ru.galkin.patterns.ifst24;

public class Main {
    public static void main(String[] args) {
        Human human =  Human.of("a", "a", "a");
        Human human2 =  Human.of("a", "a33", "a");
        Human human22 =  Human.of("a2", "a22", "a");
        Human human12 =  Human.of("3a", "a11", "a");
        Human human32 =  Human.of("44a", "a55", "a");
        Human human42 =  Human.of("55a", "a665", "a");
        Human human52 =  Human.of("543a", "a324", "a");
        System.out.println(human2 == human);

        System.out.println(human52.getMap());
        HumanExtra s = HumanExtra.of(human);
    }
}
