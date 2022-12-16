package com.example.BookMyshow.converter;

import com.example.BookMyshow.Model.MovieEntity;
import com.example.BookMyshow.dto.MovieDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieConverter {

    public static MovieEntity dtoToEntity(MovieDto movieDto){
        return MovieEntity.builder().name(movieDto.getName()).releaseDate(movieDto.getReleaseDate()).build();
        // id not shown as id is AUTO-INCREMENTED
    }

    public static MovieDto entityToDto(MovieEntity movieEntity){
        return MovieDto.builder().name(movieEntity.getName()).releaseDate(movieEntity.getReleaseDate()).id(movieEntity.getId()).build();
    }
}
