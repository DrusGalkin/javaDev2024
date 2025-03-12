package ru.galkin.reflection.test_ref.anatation.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@MyTed
public class Test {
    public static void main(String[] args) {
        final MyTed annotation = Test.class.getAnnotation(MyTed.class);
        System.out.println(annotation != null);
    }
}

//RetentionPolicy.SOURCE  - Анатация остается только в сорс кодах, и дальше никуда не идет
//RetentionPolicy.CLASS   - Анатация остается в байт коде, но в рантайме прочитать ее нельзя
//RetentionPolicy.RUNTIME - Анатация видна в рантайме

//По дефолту RetentionPolicy установлен как Class (их не видно)
//Анатация - это методанные класса
@Retention(RetentionPolicy.RUNTIME)
@interface MyTed{

}
