package ru.galkin.reflection.ex8_3;

import ru.galkin.reflection.ex8_2.Default;
import ru.galkin.reflection.ex8_2.Invoke;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Stream;

public class Util {
    private static BuilderDefault def;

    private Util() {
    }

    public static Map<Class<?>, List<String>> collect(Class<?>... clz) {
        Map<Class<?>, List<String>> map = new HashMap<>();
        List<String> tmpList = new ArrayList<>();

        for (Class<?> c : clz) {
            Method[] methods = c.getDeclaredMethods();
            for (Method m : methods) {
                if (m.isAnnotationPresent(Invoke.class)) {
                    try {
                        m.setAccessible(true);
                        tmpList.add(m.getName() + " = " + m.invoke(c.getConstructor().newInstance()));
                    } catch (Exception _) {
                    }
                }
            }
            map.put(c, new ArrayList<>(tmpList));
            tmpList.clear();
        }
        return new HashMap<>(map);
    }

    private static void setDefault(BuilderDefault defa) {
        def = defa;
    }

    public static void reset(Object objects) throws IllegalAccessException {
        Class clz = objects.getClass();

        List<Field> fields = Arrays.stream(def.getClass().getDeclaredFields())
                .peek(f -> f.setAccessible(true))
                .filter(f -> {
                    try {
                        if (f.get(objects) != null) return true;
                    } catch (Exception _) {}
                    return false;
                }).toList();

        List<Field> objFields =
                    Stream
                        .iterate(clz, Objects::nonNull, Class::getSuperclass)
                        .filter(c -> c.isAnnotationPresent(Default.class))
                        .flatMap(a -> Arrays.stream(a.getDeclaredFields()))
                        .distinct()
                        .peek(f -> f.setAccessible(true))
                        .toList();


        for(Field defEl: fields){
            for (Field objEl: objFields){
                if(objEl.isAnnotationPresent(Default.class)){
                    Default tmp = objEl.getAnnotation(Default.class);
                    objEl.set(objects, tmp.value());
                    break;
                }
                if(objEl.getType() == defEl.getType()){
                    try {
                        objEl.set(objects, defEl.get(def));
                    } catch (Exception e){}
                }
            }
        }
    }

    public static class BuilderDefault {
        private int anInt;
        private long aLong;
        private byte aByte;
        private short aShort;
        private double aDouble;
        private float aFloat;
        private boolean aBoolean;
        private String string;
        private Object object;
        private Class<?> aClass;

        public void build() {
            Util.setDefault(this);
        }

        public BuilderDefault setAnInt(int anInt) {
            this.anInt = anInt;
            return this;
        }

        public BuilderDefault setLong(long aLong) {
            this.aLong = aLong;
            return this;
        }

        public BuilderDefault setByte(byte aByte) {
            this.aByte = aByte;
            return this;
        }

        public BuilderDefault setShort(short aShort) {
            this.aShort = aShort;
            return this;
        }

        public BuilderDefault setDouble(double aDouble) {
            this.aDouble = aDouble;
            return this;
        }

        public BuilderDefault setFloat(float aFloat) {
            this.aFloat = aFloat;
            return this;
        }

        public BuilderDefault setBoolean(boolean aBoolean) {
            this.aBoolean = aBoolean;
            return this;
        }

        public BuilderDefault setString(String string) {
            this.string = string;
            return this;
        }

        public BuilderDefault setObject(Object object) {
            this.object = object;
            return this;
        }

        public BuilderDefault setClass(Class<?> aClass) {
            this.aClass = aClass;
            return this;
        }
    }
}
