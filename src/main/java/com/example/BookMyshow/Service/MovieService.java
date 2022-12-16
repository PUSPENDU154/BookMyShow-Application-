package com.example.BookMyshow.Service;

import com.example.BookMyshow.dto.MovieDto;

public interface MovieService {

    //add
    public MovieDto addMovie(MovieDto movieDto);

    //get
    public MovieDto getMovie(int id);
}
