package com.example.BookMyshow.Service.impl;

import com.example.BookMyshow.Model.MovieEntity;
import com.example.BookMyshow.Repository.MovieRepository;
import com.example.BookMyshow.Service.MovieService;
import com.example.BookMyshow.converter.MovieConverter;
import com.example.BookMyshow.dto.MovieDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
@Slf4j
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieDto addMovie(MovieDto movieDto){

        // Find out to search by name using JPA

        if (movieDto.getId()<0){
            //error
        }

        log.info("Reached addMovie function");
        // 14th dec (1:37:15)

        MovieEntity movieEntity= MovieConverter.dtoToEntity(movieDto);
        movieRepository.save(movieEntity);
        return movieDto;
    }

    @Override
    public MovieDto getMovie(int id) {
        MovieEntity movieEntity=movieRepository.findById(id).get();

//        MovieEntity dummyMovieObject=new MovieEntity();
//        MovieEntity movieEntity=movieRepository.findById(id).orElse(dummyMovieObject);  // For orElse

        MovieDto movieDto= MovieConverter.entityToDto(movieEntity);
        return movieDto;
    }
}
