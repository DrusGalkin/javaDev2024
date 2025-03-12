package ru.galkin.mainNew;

import ru.galkin.cities.City;
import ru.galkin.cities.CityOneToOne;
import ru.galkin.geometry.Lengthable;
import ru.galkin.geometry.Line;
import ru.galkin.geometry.Point;
import ru.galkin.reflection.ex8_1.*;
import ru.galkin.reflection.ex8_1.tester.ALengthable;
import ru.galkin.reflection.ex8_1.tester.TestLength;
import ru.galkin.reflection.ex8_2.ToString;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main8_1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, IOException, NoSuchMethodException {
//        //1
//        FieldCollection fff = FieldCollection.of(BBB.class);
//        System.out.println(fff);
//
//        //2
//        Line<Point> line = new Line<>(new Point(1,5), new Point(444,111));
//        Line<Point> line2 = new Line<>(new Point(11,45), new Point(0,0));
//        LineConnector.ref(line, line2);
//        System.out.println(line);
//        System.out.println(line2);

        //3
        AAA aaa = new AAA();
        System.out.println(aaa);
        BBB bbb = new BBB();
        System.out.println(bbb);

        //4
//        TestLength t = new TestLength();
//        System.out.println(t.checkLength(line));
//
//        //5
//
//        ObjectsManager m = new ObjectsManager("file.txt");
//        m.write(new Point(1,4), aaa);
//        m.read();
//
//        //6
//        System.out.println("\nffffff\n");
//        System.out.println("\nffffff\n");
//
//        Summereable s = new Summer(1, 5);
//        s = CacheProxyCreator.create(s);
//        s.sum();
//        System.out.println("\nffffff\n");
//        s.sum();
//        s.sum(); // ааа
////        Class claz1 = Summer.class;
////        Field g = claz1.getDeclaredField("x");
////        g.setAccessible(true);
////        System.out.println(g);
////        g.set(s, 10);
//
//        s.sum();
//        s.sum();

    }

}
@ALengthable
@ToString()
class AAA extends Entity implements Lengthable  {
    int a2;

    protected int a3;

    @ToString("NO")
    public int a5ццdddddddцц;
    @ToString("NO")
    private int a6;

    @Override
    @ALengthable
    public int getLength() {
        return 10;
    }
}
@ToString("NO")
class BBB extends AAA{
    @ToString("YES")
    private int GHJKL;
}