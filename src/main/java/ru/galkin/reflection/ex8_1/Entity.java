package ru.galkin.reflection.ex8_1;

import ru.galkin.reflection.ex8_2.ToString;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public abstract class Entity {
    private Map<String, String> getFields() {
        Class clazz = this.getClass();

        return Stream
                .iterate(clazz, Objects::nonNull, Class::getSuperclass)
                .filter(c -> c.isAnnotationPresent(ToString.class))
                .flatMap(c -> {
                    ToString annotation = (ToString) c.getAnnotation(ToString.class);
                    if(annotation == null) return Stream.empty();
                    return stream(c.getDeclaredFields())
                            .filter(f ->{
                                ToString fieldAnnotation = f.getAnnotation(ToString.class);
                                return fieldAnnotation != null
                                        && annotation.value().equals(ToString.NO)
                                        && fieldAnnotation.value().equals(ToString.YES)
                                        || (fieldAnnotation == null
                                        || !fieldAnnotation.value().equals(ToString.NO))
                                        && annotation.value().equals(ToString.YES);
                            });
                })
                .distinct()
                .peek(f -> f.setAccessible(true))
                .collect(Collectors.toMap(Field::getName, f -> {
                    try {
                        return String.valueOf(f.get(this));
                    } catch (Exception e) {
                        return "---";
                    }
                }));
    }

    public int getSize(){
        return getFields().size();
    }

    public String toString() {
        return this.getClass().getName() + getFields();
    }
}
