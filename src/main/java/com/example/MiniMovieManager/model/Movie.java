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
}
