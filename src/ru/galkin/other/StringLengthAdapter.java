package ru.galkin.other;

import ru.galkin.geometry.GetLengthLineOrPolyline;

public class StringLengthAdapter implements GetLengthLineOrPolyline {
    private int x;

    public StringLengthAdapter(String s){
        this.x = s.length();
    }

    @Override
    public int getLength() {
        return x;
    }
}
