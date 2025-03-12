package ru.galkin.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTudeChannel implements Publisher{
    private List<Subscriber> subscriberList = new ArrayList<>();
    private List<String> videos = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String text) {
        subscriberList.forEach(sub -> sub.showNotification(text));
    }

    public void addVideo(String video){
        this.videos.add(video);
        notifySubscriber(video);
    }
}
