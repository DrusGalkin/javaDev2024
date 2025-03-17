package ru.galkin.reflection.ex8_1;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import ru.galkin.reflection.ex8_2.ToString;

import static org.junit.jupiter.api.Assertions.*;

public class Entity_Test {
    private static final String TEMPLATE_ERROR_TO_STRING_YES = "Видимость ToString.YES работает неправильно";
    private static final String TEMPLATE_ERROR_TO_STRING_NO = "Видимость ToString.NO работает неправильно";
    private static final String TEMPLATE_ERROR_NO_EXIST_ANNOTATION = "Аннотирование работает неправильно";
    private static final String TEMPLATE_ERROR_INHERITANCE = "Нет наследуемых полей";
    private static final String TEMPLATE_ERROR_NOT_FOUND_ANNOTATION = "Аннотация не присутствует на данном классе";
    private static final String TEMPLATE_ERROR_NO_CORRECT_ARGS = "Не корректное значение value в аннотации ToString";

    private A a = new A();
    private B b = new B();
    private C c = new C();
    private D d = new D();
    private E e = new E();
    private F f = new F();
    private J j = new J();

    @BeforeEach
    public void setUp() {
        a = new A();
        b = new B();
        c = new C();
        d = new D();
        e = new E();
        f = new F();
        j = new J();
    }

    @Test
    public void annotation_exists() {
        assertTrue(a.getClass().isAnnotationPresent(ToString.class), TEMPLATE_ERROR_NO_EXIST_ANNOTATION);
    }

    @Test
    public void YES_correct() {
        assertEquals(4, b.getSize(), TEMPLATE_ERROR_TO_STRING_YES);
    }

    @Test
    public void NO_correct() {
        assertEquals(0, c.getSize(), TEMPLATE_ERROR_TO_STRING_NO);
    }

    @Test
    public void NO_fieldWithToString_YES() {
        assertEquals(1, d.getSize(), TEMPLATE_ERROR_TO_STRING_NO);
    }

    @Test
    public void inheritanceFields_YES() {
        assertEquals(5, e.getSize(), TEMPLATE_ERROR_INHERITANCE);
    }

    @Test
    public void inheritanceFields_NO() {
        assertEquals(4, f.getSize(), TEMPLATE_ERROR_INHERITANCE);
    }

    @Test
    public void annotationToString_testA_YES() {
        ToString annotation = a.getClass().getAnnotation(ToString.class);
        assertNotNull(annotation, TEMPLATE_ERROR_NOT_FOUND_ANNOTATION);
        assertEquals("YES", annotation.value(), TEMPLATE_ERROR_TO_STRING_YES);
    }

    @Test
    public void annotationToString_testC_YES() {
        ToString annotation = c.getClass().getAnnotation(ToString.class);
        assertNotNull(annotation, TEMPLATE_ERROR_NOT_FOUND_ANNOTATION);
        assertEquals("NO", annotation.value(), TEMPLATE_ERROR_TO_STRING_YES);
    }

    @Test
    public void noCorrectArgs_ToString(){
        ToString tmp = j.getClass().getAnnotation(ToString.class);
        assertFalse(ToString.YES.equals(tmp.value()) || ToString.NO.equals(tmp.value()), TEMPLATE_ERROR_NO_CORRECT_ARGS);
    }

    @ToString()
    private static final class A extends Entity {
    }

    @ToString()
    private static class B extends Entity {
        private int a;
        private String b;
        public double c;
        Object d;
    }

    @ToString("NO")
    private static final class C extends Entity {
        private int a;
        protected String b;
        public double c;
        Object d;
    }

    @ToString("NO")
    private static final class D extends Entity {
        private int a;
        @ToString()
        protected String b;
        public double c;
        Object d;
    }

    @ToString
    private static final class E extends B {
        int a2;
    }

    @ToString("NO")
    private static final class F extends B {
        String m;
    }

    @ToString("dfghjkl;")
    private static final class J extends Entity{
    }
}
