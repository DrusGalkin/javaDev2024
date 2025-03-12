package ru.galkin.reflection.ex8_1.tester;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class Validator {
    private final static Class<?> TEST = IsTest.class;

    public static void of(Object o, Class...clazz){
        if(clazz.length > 0){
            try{
                List<Class> classList =
                        Arrays.stream(clazz)
                                .filter(Validator::checkFoundAnnotation)
                                .toList();
                if (classList.size() == 0 || classList == null) throw new NullPointerException();

                List<Method> methodList = classList
                        .stream()
                        .parallel()
                        .flatMap(c -> Arrays.stream(c.getDeclaredMethods()))
                        .peek(m -> m.setAccessible(true))
                        .toList();

                boolean response = methodList
                        .stream()
                        .allMatch(m -> {
                            try {
                                return (boolean) m.invoke(o);
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            } catch (InvocationTargetException e) {
                                throw new RuntimeException(e);
                            }
                        });
                if (response) System.out.println("Все тесты пройдены");
                else System.out.println("Все тесты не пройдены");
            } catch (Exception e){

            }
        } throw new EmptyStackException();
    }

    private static boolean checkFoundAnnotation(Class сlazz){
        if(сlazz.isAnnotationPresent(TEST)) return true;
        throw new RuntimeException();
    }
}
