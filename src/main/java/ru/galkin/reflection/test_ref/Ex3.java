package ru.galkin.reflection.test_ref;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee(10, "Andrew", "IT");
        Class clas = employee.getClass();

        /// Не получиться просто взять и установить значение поля через get, хотя объект Field, был создан с
        /// использованием getDeclaredField, нужно дать доступ к изменению полей
        Field field = clas.getDeclaredField("salary");
        field.setAccessible(true); /// Теперь можно менять значения

        /// Пример, который показывал ермаков насчет таких мувов
        field.set(employee, 912.4); /// Установили новое значение (поле финальное)
        double salaryEmp = (Double) field.get(employee);

        /// Вывело 912.4
        System.out.println(salaryEmp);
        /// Сам объект не изменился, выводит 1000
        System.out.println(employee);
        /// А тут, как было 912.4, так и осталось
        System.out.println(field.get(employee));
    }
}
