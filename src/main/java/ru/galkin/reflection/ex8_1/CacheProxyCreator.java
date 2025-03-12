package ru.galkin.reflection.ex8_1;

import java.lang.reflect.Proxy;

public class CacheProxyCreator {

    private CacheProxyCreator(){

    }

    @SuppressWarnings("unchecked")
    public static <T> T create(T o){
        if(o != null)
            return (T) Proxy
                    .newProxyInstance(
                            o.getClass().getClassLoader(),
                            o.getClass().getInterfaces(),
                            new ProxyHandler(o)
                    );
        throw new NullPointerException();
    }
}
