package com.examly.springapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Song;
import com.examly.springapp.service.Songservice;

@RestController
public class ApiController {

    @Autowired
    private Songservice service;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addSong")
    public boolean addSong(@RequestBody Song Song)
    {
        return service.addSong(Song);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getAllSong")
    public List <Song> getAllSongs()
    {
        return service.getAllSongs();
    }

   
    
}
