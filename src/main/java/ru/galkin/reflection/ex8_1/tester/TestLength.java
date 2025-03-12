package ru.galkin.reflection.ex8_1.tester;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@IsTest
public class TestLength {
    private int length ;
    private final static Map<Class<?>, Exception> instance = new HashMap<>();

    public boolean checkLength(Object o) throws InvocationTargetException, IllegalAccessException {
        Class<?> clazz = o.getClass();
        try {
            Method methods = Arrays.stream(clazz.getDeclaredMethods())
                            .filter(method -> method.isAnnotationPresent(ALengthable.class))
                            .peek(m -> m.setAccessible(true))
                            .findFirst()
                            .orElse(null);

            this.length = (int) methods.invoke(o);
            if(methods != null && length > 0 && length >= 20){
                System.out.println(length);
                return true;
            }
            throw new NotFoundLength("Тест на длину не пройден :(");
        } catch (NotFoundLength e){
            instance.put(clazz, e);
            System.out.println(e.getMessage());
            return false;
        }
    }
}
