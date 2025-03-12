package ru.galkin.multithreading;


import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class les1 {
    public static void main(String... abd) {
//        String name = Thread.currentThread().getName();
//        System.out.println(name);
//        Thread td = Thread.currentThread();
//        System.out.println(td);
//        Thread td2 = new JThread("Крутой");
//        System.out.println(td2);
//
//        System.out.println(Thread.currentThread().getName() + " старт");
//        new JThread("Омагад").start();
//        System.out.println(Thread.currentThread().getName() + " стоп");
        System.out.println(Thread.currentThread().getName() + " start");
        Thread t = new JThread("Поток");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " stop");

//        for(int i = 0; i < 6; i++){
//          new JThread("Поток " + i).start();
//        }
    }
}

class JThread extends Thread {

    public JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName() + " стартанул");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        System.out.println(currentThread().getName() + " закрылся");
    }
}
