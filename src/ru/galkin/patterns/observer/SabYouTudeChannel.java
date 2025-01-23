package ru.galkin.patterns.observer;

public class SabYouTudeChannel implements Subscriber{
    @Override
    public void showNotification(String text) {
        System.out.println("Вышло новое видео: " + text);
    }
}
