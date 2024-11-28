package ru.galkin.other;

public class Storage<T>{
    private T t;
    private Type type;

    public Storage(T t){
        this.t = t;
        System.out.println(this.t);
    }

    public T getItem(){
        return this.t;
    }

    public void check(T t){
//        type = new IntegerType();
//        this.t =  (T) type.check(t);
//
//        if(t instanceof String) {
//            type = new StrungType();
//            this.t =  (T) type.check(t);
//        }
    }
}
