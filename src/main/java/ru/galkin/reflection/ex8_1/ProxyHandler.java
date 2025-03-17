package ru.galkin.reflection.ex8_1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProxyHandler implements InvocationHandler {
    private Object obj;
    private Map<Key, Object> cacheMap = new LinkedHashMap<>();

    public ProxyHandler(Object obj) {
        this.obj = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method = obj.getClass().getMethod(method.getName(), method.getParameterTypes());
        if(!method.isAnnotationPresent(Cache.class))
            return method.invoke(this.obj, args);

        Key key = new Key(method, method.getParameterTypes());
        if (!cacheMap.containsKey(key)) {
            Object obj2 = method.invoke(this.obj, args);
            cacheMap.put(key, obj2);
            return cacheMap.get(key);
        }
        return cacheMap.get(method);
    }
}

record Key(Method m, Object...args) {

}
