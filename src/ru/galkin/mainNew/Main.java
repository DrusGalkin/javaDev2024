package ru.galkin.mainNew;

import ru.galkin.geometry.Line;
import ru.galkin.geometry.Point;
import ru.galkin.geometry.Polyline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String...args){
        List<Point> list = new ArrayList<>(){{
            add(new Point(1,4));
            add(new Point(5,2));
            add(new Point(55,22));
            add(new Point(10,0));
            add(new Point(6,16));
        }};

        Line<Point> line = new Line<>((new Point(1,4)),(new Point(5,2)));

        List<Line> l = List.of(line);
        Integer a = l.stream().map(Line::getLength).reduce(0, Integer::sum);

        List<String> strings = List.of("A","B","C","D","W","G","M");

        String s = strings.stream()
                .map(s1 -> s1 + " ")
                .reduce("", String::concat);

        System.out.println(s);
    }
}
