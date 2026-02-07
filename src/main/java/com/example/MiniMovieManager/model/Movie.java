package com.example.MiniMovieManager.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class Movie {
    private Long id;

    @NotBlank
    private String title;

    private String genre;

    @Min(1) @Max(10)
    private double rating;

    @Min(30)
    private Integer duration;

    @Min(1900)
    private LocalDate releaseDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank String getTitle() {
        return title;
    }

    public void setTitle(@NotBlank String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public @Min(1) @Max(10) double getRating() {
        return rating;
    }

    public void setRating(@Min(1) @Max(10) double rating) {
        this.rating = rating;
    }

    public @Min(30) Integer getDuration() {
        return duration;
    }

    public void setDuration(@Min(30) Integer duration) {
        this.duration = duration;
    }

    public @Min(1900) LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(@Min(1900) LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
