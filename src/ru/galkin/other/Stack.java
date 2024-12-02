package ru.galkin.other;

import java.util.ArrayList;
import java.util.List;

public class Stack<Object> {
    private List<Object> stack = new ArrayList<>();

    public void push(Object object){
        stack.add(object);
    }

    public void pop(){
        stack.remove(stack.getFirst());
    }

    public Object peek(){
        return stack.getLast();
    }

    public String toString(){
        return "Stack размером в " + stack.size() + " ячеек:\n" + stack;
    }
}
