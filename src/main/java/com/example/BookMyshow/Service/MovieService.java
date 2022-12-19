package com.example.BookMyshow.Service;

import com.example.BookMyshow.dto.EntryDto.MovieEntryDto;
import com.example.BookMyshow.dto.ResponseDto.MovieNameAndIdObject;
import com.example.BookMyshow.dto.ResponseDto.MovieResponseDto;

public interface MovieService {

    //Add movie
    MovieResponseDto addMovie(MovieEntryDto movieEntryDto);


    //get movie
    MovieResponseDto getMovie(int id);

    MovieNameAndIdObject getNameAndId(int id);


}