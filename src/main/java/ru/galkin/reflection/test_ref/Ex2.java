package ru.galkin.reflection.test_ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String...omg) throws Exception{
        Class empClz = Employee.class;
        /// Создаем объект
        Object o = empClz.newInstance(); // Старая тема
        Employee emp = (Employee) empClz.newInstance();

        /// true создание объекта с использованием рефлексии
        Constructor<Employee> c = empClz.getConstructor();
        Employee emp2 = c.newInstance();

        Constructor<Employee> c2 = empClz.getConstructor(int.class, String.class, String.class);
        Employee emp3 = c2.newInstance(1,"frdff", "ghjkl");
        System.out.println(emp3);

        /// Вызов метода у объекта с использованием рефлексии
        Method m1 = empClz.getMethod("setSalary", double.class);
        m1.invoke(emp3, 199.5);
        System.out.println(emp3);

    }
}
