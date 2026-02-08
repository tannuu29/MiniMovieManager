package com.example.MiniMovieManager.storage;

import com.example.MiniMovieManager.model.Movie;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MovieStorage {
    private Map<Long, Movie> movieMap = new HashMap<>();

    public Movie save(Movie movie){
        movieMap.put(movie.getId(), movie);
        return movie;
    }

    public List<Movie> findAll(){
        return new ArrayList<>(movieMap.values());
    }

    public Movie getById(Long id){
        return movieMap.get(id);
    }

    public Movie deleteById(Long id){
        return movieMap.remove(id);
    }

    public Movie update(Long id, Movie movie) {
        movieMap.put(id, movie);
        return movie;
    }
}
