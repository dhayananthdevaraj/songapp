package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Song;
import com.examly.springapp.repository.SongRepo;

@Service
public class Songservice {

    @Autowired
    private SongRepo songRepo;

    public boolean addSong(Song Song) {
        return songRepo.save(Song) != null ? true : false;
    }
        
    
    public List <Song> getAllSongs()
    {
        return songRepo.findAll();
    }

   
}
