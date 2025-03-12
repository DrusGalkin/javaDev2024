package ru.galkin.patterns.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

    }
}

interface Actions<T>{
    void make(Predicate<T> predicate);
}

class PlusData<T> implements Actions<T>{
    private Macros<T> t;

    public void setMacros(Macros<T> t){
        this.t = t;
        t.addActions(this);
    }

    @Override
    public void make(Predicate<T> predicate) {
        for (T item : t.getData()) {
            if (predicate.test(item)) {
                if (item instanceof Integer) {
                    Integer result = (Integer) item + 5; // Пример: прибавляем 5
                    System.out.println("Plus: " + item + " -> " + result);
                } else if (item instanceof String) {
                    String result = (String) item + " строка плюс"; // Пример: добавляем строку
                    System.out.println("Plus: " + item + " -> " + result);
                }
            }
        }
    }
}


class MinusData<T> implements Actions<T>{
    private Macros<T> t;

    public MinusData(Macros<T> t){
        this.t = t;
        t.addActions(this);
    }

    public void make(Predicate<T> predicate) {
        for (T item : t.getData()) {
            if (predicate.test(item)) {
                if (item instanceof Integer) {
                    Integer result = (Integer) item - 5;
                    System.out.println("Minus: " + item + " -> " + result);
                } else if (item instanceof String) {
                    String result = (String) item + " строка минус";
                    System.out.println("Minus: " + item + " -> " + result);
                }
            }
        }
    }
}

class MacrosManager{
    private static MacrosManager instance;
    private static final Map<String, Macros> map = new HashMap<>();
    private final String name;

    private MacrosManager(String name){
        this.name = name;
    }

    public static MacrosManager crate(String name){
         if(instance == null) return instance = new MacrosManager(name);
         return instance;
    }

    public void addMacros(Macros m){
        String key = m.getName();
        if(!map.containsKey(key)) map.put(key, m);
        else throw new ArrayIndexOutOfBoundsException();
    }

    public Macros getMacros(String name){
        if(map.containsKey(name)) return map.get(name);
        return null;
    }

    public String getName() {
        return name;
    }
}

class Macros<T>{
    private String name;
    private List<Actions> actionsLists;
    private List<T> data;

    private Macros(String name){
        actionsLists = new ArrayList<>();
        data = new ArrayList<>();
        this.name = name;
    }

    public static <T>Macros<T> create(String name){
        return new <T>Macros<T>(name);
    }

    public void addActions(Actions...actions){
        for(Actions i : actions){
            if(i == null) continue;
            actionsLists.add(i);
        }
    }

    public void applyActions() {
        for (Actions action : actionsLists) {
            action.make(item -> true);
        }
    }

    public String getName() {
        return name;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    void setName(String name) {
        this.name = name;
    }

    List<Actions> getActionsLists() {
        return actionsLists;
    }

    public void setActionsLists(List<Actions> actionsLists) {
        this.actionsLists = actionsLists;
    }
}
