package ru.galkin.mainNew;

import ru.galkin.other.Box;
import ru.galkin.other.Stack;
import ru.galkin.other.Storage;
import ru.galkin.people.Student;

public class Main6_1 {
    public static void main(String[] args){
        //1
        Box<Integer> box = new Box<>(3);
        System.out.println(box.getItem());
        System.out.println(box);

        //2
        Integer a = null;
        Storage<Integer> storage2 = new Storage<>(67);
        storage2.getAlternative(0);
        storage2.getAlternative(-99);

        //3+4
        Student s1 = new Student("Андрей",5,5,5,5,5,5,5,5,5,5,5,5,5,5,5);
        Student s2 = new Student("неАндрей",2,2,2,2,2,2,2,2,2,2,2,2,2);
        System.out.println("tooooo - " + s1.compare(s2));System.out.println("tooo2oo - " + s2.compare(s2));

        //6
        Stack stack = new Stack();

        stack.push(3);
        stack.push(box);
        stack.push(storage2);

        System.out.println(stack);
    }
}
