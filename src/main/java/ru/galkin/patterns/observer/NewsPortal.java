package ru.galkin.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPortal {
    private List<Channel> channels = new ArrayList<>();
    private String news;

    public void add(Channel channel){
        this.channels.add(channel);
    }

    public void remove(Channel channel){
        this.channels.remove(channel);
    }

    public void setNews(String news){
        this.news = news;
        for(Channel i : channels){
            i.update(news);
        }
    }

}
