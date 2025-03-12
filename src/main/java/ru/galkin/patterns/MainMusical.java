package ru.galkin.patterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMusical {
    public static void main(String[] args) {

    }
}

class VkMusic{
    private static VkMusic instance;
    private final static Map<String, Musician> map = new HashMap<>();

    private VkMusic(){
        //*
    }

    public static VkMusic create(){
        if(instance == null) return instance = new VkMusic();
        return instance;
    }

    public void addMusician(Musician musician){
        String key = musician.getName();
        if(!map.containsKey(key)) map.put(key, musician);
        else System.out.println(key + " - уже существует на платформе");
    }
}

class Musician{
    private static final VkMusic vkMusic = VkMusic.create();
    private String name;
    private List<Album> albumList;

    public Musician(String name){
        this.name = name;
        vkMusic.addMusician(this);
    }

    public String getName() {
        return name;
    }

    public List<Album> getAlbumList() {
        return new ArrayList<>(albumList);
    }
}

class Music{
    private Musician musician;
    private Album album;
    private String name;

    public Music(String name, Musician musician, Album album){
        this.name = name;
        this.musician = musician;
        this.album = album;
    }

    public Musician getMusician() {
        return musician;
    }

    public Album getAlbum() {
        return album;
    }

    public String getName() {
        return name;
    }
}


class Album{
    private String name;
    private Musician musician;
    private List<Music> musicList;

    public String getName() {
        return name;
    }

    public List<Music> getMusicList() {
        return new ArrayList<>(musicList);
    }
}