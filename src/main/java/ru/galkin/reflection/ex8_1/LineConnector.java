package ru.galkin.reflection.ex8_1;

import ru.galkin.geometry.Line;
import ru.galkin.geometry.Point;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class LineConnector{
    public static void ref(Line<Point> l1, Line<Point> l2) throws NoSuchFieldException, IllegalAccessException {
        Field fld = l1.getClass().getDeclaredField("p2");
        Field fld2 = l2.getClass().getDeclaredField("p1");

        fld.setAccessible(true);
        fld2.setAccessible(true);

        fld2.set(l2, fld.get(l1));
    }
}
