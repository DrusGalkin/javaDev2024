package ru.galkin.other;

import ru.galkin.geometry.Point;

import java.util.List;

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

    public double sort(List<Box<? extends Number>> listBox){
        double max = 0;
        for (Box<? extends Number> number : listBox) {
            if ((double) number.getItem() > max) {
                max = (double) number.getItem();
            }
        }
        return max;
    }

    public static Box<?> addPoint(Box<?> box, Point p){
        return new Box<>(p);
    }
}