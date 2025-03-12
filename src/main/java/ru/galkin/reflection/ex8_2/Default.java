package ru.galkin.reflection.ex8_2;

import javax.lang.model.util.ElementScanner9;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Optional;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Default {
    Class<?> value();
}

//ElementScanner9 втф