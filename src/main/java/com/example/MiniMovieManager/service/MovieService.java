package com.example.MiniMovieManager.service;

import com.example.MiniMovieManager.dto.MovieReqDto;
import com.example.MiniMovieManager.dto.MovieResDto;
import com.example.MiniMovieManager.model.Movie;
import com.example.MiniMovieManager.storage.MovieStorage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    private final MovieStorage movieStorage;
    private Long counter = 1001L;

    public MovieService(MovieStorage movieStorage){
        this.movieStorage =movieStorage;
    }

    public String addMovie(MovieReqDto movieReqDto){
        Movie movie = new Movie();
        movie.setId(counter++);
        movie.setTitle(movieReqDto.getTitle());
        movie.setGenre(movieReqDto.getGenre());
        movie.setRating(movieReqDto.getRating());
        movie.setDuration(movieReqDto.getDuration());
        movie.setReleaseDate(movieReqDto.getReleaseDate());

        movieStorage.save(movie);
        return movie.getTitle() +" is added in the list.";
    }

    public List<MovieResDto> getAllMovies(){
        List<Movie> movies = movieStorage.findAll();
        List<MovieResDto> responseList = new ArrayList<>();

        for(Movie movie : movies){
            MovieResDto resDto = new MovieResDto();
            resDto.setId(movie.getId());
            resDto.setTitle(movie.getTitle());
            resDto.setGenre(movie.getGenre());
            resDto.setDuration(movie.getDuration());
            resDto.setRating(movie.getRating());
            resDto.setReleaseDate(movie.getReleaseDate());

            responseList.add(resDto);
        }
        return responseList;
    }

    public MovieResDto getMovie(Long id){
        Movie movie = movieStorage.getById(id);
        MovieResDto resDto = new MovieResDto();
        resDto.setId(movie.getId());
        resDto.setTitle(movie.getTitle());
        resDto.setGenre(movie.getGenre());
        resDto.setRating(movie.getRating());
        resDto.setDuration(movie.getDuration());
        resDto.setReleaseDate(movie.getReleaseDate());
        return resDto;
    }

    public String deleteMovie(Long id){
        Movie movie = movieStorage.deleteById(id);
        return movie.getTitle() +" is deleted from the list.";
    }
}
