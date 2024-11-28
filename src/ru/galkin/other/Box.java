package ru.galkin.other;

public class Box<Ы> {
     private Ы s;

    public Box(Ы s){
        check(s);
    }

    public void setItem(Ы s){
        if(isEmpty()) check(s);
        else throw new RuntimeException("box is not empty!");
    }

    public Ы getItem(){
        Ы temp = this.s;
        this.s = null;
        return temp;
    }

    private void check(Ы s){
        if(s != null) this.s = s;
        else throw new RuntimeException("Item is not null!");
    }

    public boolean isEmpty(){
        if(this.s == null) return true;
        return false;
    }

    public String toString(){
        if(isEmpty()) return "Коробка пуста.";
        return this.s.toString();
    }
}