package ru.galkin.reflection.test_ref;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    void sum(int a, int b){
        int res = a + b;
        System.out.printf("Sum: %d + %d = %d", a, b, res);
    }

    void sub(int a, int b){
        int res = a - b;
        System.out.printf("Sub: %d - %d = %d", a, b, res);
    }

    void mul(int a, int b){
        int res = a * b;
        System.out.printf("Sum: %d * %d = %d", a, b, res);
    }

    void div(int a, int b){
        int res = a / b;
        System.out.printf("Sum: %d / %d = %d", a, b, res);
    }
}

class TestCalculator{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader( new FileReader("textCalculator.txt"))){
            String methodName = reader.readLine();
            String arg1 = reader.readLine();
            String arg2 = reader.readLine();

            System.out.println(methodName + " " + arg1 + " " + arg2);

            Calculator calculator = new Calculator();
            Class clz = calculator.getClass();
            List<Method> methodList = List.of(clz.getDeclaredMethods());

            Method method = methodList
                    .stream()
                    .filter(m -> m.getName().equals(methodName))
                    .collect(Collectors.toList()).getFirst();

            method.invoke(calculator, Integer.parseInt(arg1), Integer.parseInt(arg2));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}