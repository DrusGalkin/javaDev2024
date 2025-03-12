package ru.galkin.patterns.ifst24;

import java.util.HashMap;
import java.util.Map;

public class Human {
    private static Map<String, Human> map = new HashMap<>();
    private String surname;
    private String name;
    private String patronymic;

    private Human(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    static public Human of(String surname, String name, String patronymic){
        if(!map.containsKey(name)) {
            map.put(name, new Human(name, name, patronymic));
            return map.get(name);
        }
        return map.get(name);

    }

    public static Map<? extends String, ? extends Human> getMap(){
        return new HashMap<>(map);
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return name + '\''
;
    }
}
