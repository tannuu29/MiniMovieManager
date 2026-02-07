package com.example.MiniMovieManager.service;

import com.example.MiniMovieManager.model.Developer;
import org.springframework.stereotype.Service;

@Service
public class DeveloperService {
    public String developedBy(){
        Developer developer = new Developer();
        developer.setName("Tanisha Nainwal");
        developer.setEmail("tanishanainwal.5@gmail.com");
        return "Developed By : " + developer.getName() + " \nEmail id: " + developer.getEmail();
    }
}
