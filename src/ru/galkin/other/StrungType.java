package ru.galkin.other;

public class StrungType implements Type<String>{
    @Override
    public String check(String t) {
        if(t == null) return "default";
        if (t == "hello") return t = "hello world";
        return t;
    }
}
