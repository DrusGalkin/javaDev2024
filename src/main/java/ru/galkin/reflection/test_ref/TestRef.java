package ru.galkin.reflection.test_ref;

import ru.galkin.geometry.Point;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class TestRef {
    public static void main(String[] args) {
        Class clz = Point.class;
        List<Field> fields = List.of(clz.getDeclaredFields());
        List<Method> methods = List.of(clz.getMethods());

        System.out.printf("Выбранный класс %s\n", clz.getName());
        System.out.println("Поля: ");
        fields.forEach(f ->
                System.out.println(
                        Ex1.toStringModifiers(f.getModifiers()) + f.getType().getName() + " " + f.getName()
                ));
        System.out.println("Методы: ");
        methods.stream()
                .filter(m -> m.getModifiers() < 5)
                .forEach(m -> System.out.println(
                        m.toGenericString()
                ));
    }
}
