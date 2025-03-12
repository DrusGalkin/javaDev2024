package ru.galkin.reflection.ex8_1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProxyHandler implements InvocationHandler {
    private Object obj;
    private Map<Method, Object> cacheMap = new LinkedHashMap<>();
    private Map<Field, Object> objectState = new LinkedHashMap<>();

    public ProxyHandler(Object obj) {
        this.obj = obj;
    }

    private void checkState(){
        Class<?> clazz = this.obj.getClass();
        if(objectState.containsValue(obj)){
            List<Field> f1List = Arrays.stream(clazz.getDeclaredFields()).distinct().toList();
            List<Field> f2List = objectState.keySet().stream().distinct().toList();
            mapChecker(f1List.equals(f2List));
            return;
        }
       Arrays.stream(clazz.getDeclaredFields())
                       .forEach(f -> objectState.put(f, this.obj));
        System.out.println("Добавлен в Map");
    }

    private void mapChecker(boolean eq){
        if(!eq){
            System.out.println("cacheMap clear");
            cacheMap.clear();
            checkState();
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method = obj.getClass().getMethod(method.getName());
        checkState();
        if(!method.isAnnotationPresent(Cache.class))
            return method.invoke(this.obj, args);

        if (!cacheMap.containsKey(method)) {

            Object obj2 = method.invoke(this.obj, args);
            cacheMap.put(method, obj2);
            return obj2;
        }
        return cacheMap.get(method);
    }
}
