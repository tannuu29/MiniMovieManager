package com.example.MiniMovieManager.controller;

import com.example.MiniMovieManager.dto.MovieReqDto;
import com.example.MiniMovieManager.dto.MovieResDto;
import com.example.MiniMovieManager.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")

public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    //Add Movie (Only For ADMIN)
    @PostMapping("/admin/add")
    public ResponseEntity<String> addMovie(@Valid @RequestBody MovieReqDto movieReqDto){
        return ResponseEntity.ok(movieService.addMovie(movieReqDto));
    }

    //Get All Movies
    @GetMapping
    public ResponseEntity<List<MovieResDto>> getAllMovies(){
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    //Get Movie By id
    @GetMapping("/{id}")
    public ResponseEntity<MovieResDto> getMovieById(@PathVariable Long id){
        return ResponseEntity.ok(movieService.getMovie(id));
    }

    @DeleteMapping("/admin/delete/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable Long id){
        return ResponseEntity.ok(movieService.deleteMovie(id));
    }

    @PutMapping("/admin/update/{id}")
    public MovieResDto updateMovie(@PathVariable Long id, @Valid @RequestBody MovieReqDto reqDto) {
        return movieService.updateMovie(id, reqDto);
    }
}
