package com.example.MiniMovieManager.controller;

import com.example.MiniMovieManager.service.DeveloperService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")

public class DeveloperController {
    private final DeveloperService developerService;

    public DeveloperController(DeveloperService developerService){
        this.developerService = developerService;
    }

    @GetMapping("/")
    public String home() {
        return "Mini Movie Manager API is running!";
    }

    @GetMapping("/developer")
    public String developedBy(){
        return developerService.developedBy();
    }
}
