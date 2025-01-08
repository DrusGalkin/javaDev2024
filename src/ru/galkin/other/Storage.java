package ru.galkin.other;

public class Storage<T>{
    private T t;
    private final static Storage<?> EMPTY = new Storage<>(null);

    private Storage(T t){
        this.t = t;
    }

    public static <U>Storage of(U u){
        return u == null ? (Storage<U>) EMPTY : new Storage(u);
    }

    public T getItem(){
        T temp = this.t;
        this.t = null;
        return temp;
    }

    public T getAlternative(T obj){
        if(obj == null) return obj;
        return this.t;
    }
}
