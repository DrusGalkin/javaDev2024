package ru.galkin.reflection.ex8_1;

public class Summer implements Summereable{
    private int x,y;

    public Summer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    @Cache
    public int sum() {
        System.out.println("summing");
        return x + y;
    }
}
