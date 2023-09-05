package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {
    @Id
    public int id;
    private String name;
    private String song;
    private String releaseYear;


    public Song(int id, String name, String song, String releaseYear) {
        this.id = id;
        this.name = name;
        this.song = song;
        this.releaseYear = releaseYear;
    }
    
    public Song(){

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSong() {
        return song;
    }
    public void setSong(String song) {
        this.song = song;
    }
    public String getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
}


