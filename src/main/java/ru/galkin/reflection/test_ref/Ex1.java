package ru.galkin.reflection.test_ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Class empClz = Class.forName("ru.galkin.reflection.test_ref.Employee");
        //Способы получения объекта класса класс
        Class empClz2 = Employee.class;
        Employee emp = new Employee();
        Class empClz3 = emp.getClass();
        empClz.getField("id");
        System.out.println(empClz.getName());

        System.out.println("==========================");
        Field empId = empClz.getField("id");
        System.out.println(empId.getType());

        System.out.println("============Получаем все публичные поля==============");
        Field[] fieldsEmpClz = empClz.getFields();
        Arrays.stream(fieldsEmpClz).forEach(f -> System.out.println("Type of: " + f.getType()));

        System.out.println("============Получаем все все поля==============");
        List<Field> fullFields = List.of(empClz.getDeclaredFields());
        fullFields
                .forEach(f -> System.out.println(
                        "Type of: " + Ex1.toStringModifiers(f.getModifiers()) + f.getType()));

        System.out.println("============Получаем метод==============");
        Method method = empClz.getMethod("increaseSalary");
        System.out.println("Type method: " + method.getReturnType());
        System.out.println("Type of arguments increaseSalary: " + Arrays.toString(method.getParameterTypes()));

        Method method2 = empClz.getMethod("setSalary", double.class);
        System.out.println("Type of arguments setSalary: " + Arrays.toString(method2.getParameterTypes()));

        System.out.println("============Получаем все публичные методы==============");
        List<Method> methodListEpm = List.of(empClz.getMethods());
        methodListEpm
                .stream()
                .forEach(m -> System.out.println(
                        m.getReturnType() + " "
                                + m.getName() + " "
                                + Arrays.toString(m.getParameterTypes())
                ));

        System.out.println("============Получаем все методы==============");
        //не покажет унаследованные методы от объекта, но переопределенные покажет
        List<Method> allMethods = List.of(empClz.getDeclaredMethods());
        allMethods
                .forEach(m -> System.out.println(
                        Ex1.toStringModifiers(m.getModifiers())
                                + m.getReturnType() + " "
                                + m.getName() + " "
                                + Arrays.toString(m.getParameterTypes())
                ));

        System.out.println("============Получаем методы через getDeclaredMethod, но по выбору модификатора доступа==============");
        List<Method> allMethods2 = List.of(empClz.getDeclaredMethods());
        allMethods2
                .stream()
                //можно задать проверку на любой модификатор доступа
                .filter(m -> Modifier.isPublic(m.getModifiers()))
                .forEach(m -> System.out.println(
                        Modifier.toString(m.getModifiers()) + " "
                                + m.getReturnType() + " "
                                + m.getName() + " "
                                + Arrays.toString(m.getParameterTypes())
                ));

        System.out.println("============Получаем конструктор==============");
        Constructor constructor1 = empClz.getConstructor();
        System.out.println(
                "Количество параметров конструктора - " + constructor1.getParameterCount()
                        + "\n" + "Тип параметров - " + Arrays.toString(constructor1.getParameterTypes())
        );

        System.out.println("============Получаем конструктор c конкретными параметрами==============");
        Constructor constructor2 = empClz.getConstructor(int.class, String.class, String.class);
        System.out.println(
                "Количество параметров конструктора - " + constructor2.getParameterCount()
                        + "\n" + "Тип параметров - " + Arrays.toString(constructor2.getParameterTypes())
        );

        System.out.println("============Получаем все конструкторы==============");
        List<Constructor> constructorList = List.of(empClz.getConstructors());
        AtomicInteger count = new AtomicInteger();
        constructorList
                .forEach( c ->{
                            System.out.println(count.incrementAndGet() + "\nКоличество параметров конструктора - " + c.getParameterCount()
                                    + "\n" + "Тип параметров - " + Arrays.toString(c.getParameterTypes()));

                        }
                );
    }

    public static String toStringModifiers(int mod) {
        return mod == 0 ? "default " :
                mod == 1 ? "public " :
                        mod == 2 ? "private " :
                                mod == 4 ? "protected " :
                                        "xz ";
    }
}
