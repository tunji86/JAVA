package com.OlatunjiOjuko;

import java.util.ArrayList;

public class Song {
    private String Title;
    private double duration;


    public Song(String title, double duration) {
        this.Title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    public double getDuration() {
        return duration;
    }


    public static Song songConstructor (String Title, double duration){
        return new Song(Title, duration);
    }

}
