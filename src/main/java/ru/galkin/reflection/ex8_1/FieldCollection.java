package ru.galkin.reflection.ex8_1;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FieldCollection{
    private Class<?> tClass;
    private List<Field> fields;

    private FieldCollection(Class<?> clz, List<Field> fields){
        this.tClass = clz;
        this.fields = new ArrayList<>(fields);
    }

    public static FieldCollection of(Class<?> clz) throws ClassNotFoundException{
        if(clz != null) {
            List<Field> fields = new ArrayList<>();
            Class<?> tmp = clz;
            while(tmp != null){
                fields.addAll(Arrays.asList(tmp.getDeclaredFields()));
                fields.addAll(Arrays.asList(tmp.getFields()));
                tmp = tmp.getSuperclass();
            }
            return new FieldCollection(clz, fields.stream().distinct().toList());
        }
        throw new ClassNotFoundException();
    }

    public Field getField(int index){
        if(index > fields.size() || index < 0) throw new IndexOutOfBoundsException();
        return this.fields.get(index);
    }

    public List<Field> getListFields(){
         return new ArrayList<>(fields);
    }

    private Map<String, List<String>> mapFields(){
        return fields.stream()
                .parallel()
                .collect(
                        Collectors
                        .groupingBy(
                        p-> Modifier.toString(p.getModifiers()),
                        Collectors.mapping(Field::getName, Collectors.toList()))
                );
    }

    @Override
    public String toString() {
        return "Класс " + tClass.getName() + " c полями:\n"
               + mapFields();
    }
}
