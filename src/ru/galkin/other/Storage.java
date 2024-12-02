package ru.galkin.other;

public class Storage<T>{
    private T t;

    public Storage(T t){
        this.t = t;
    }

    public T getItem(){
        return this.t;
    }

    public T getAlternative(T obj){
        if(obj == null) return obj;
        return this.t;
    }
}
