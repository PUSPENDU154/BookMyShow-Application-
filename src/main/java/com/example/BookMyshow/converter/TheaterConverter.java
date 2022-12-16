package com.example.BookMyshow.converter;

import com.example.BookMyshow.Model.TheaterEntity;
import com.example.BookMyshow.dto.TheaterDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheaterConverter {

    public static TheaterEntity dtoToEntity(TheaterDto theaterDto){
        return TheaterEntity.builder().city(theaterDto.getCity()).name(theaterDto.getName()).
                address(theaterDto.getAddress()).type(theaterDto.getType()).build();
    }

    public static TheaterDto entityToDto(TheaterEntity theaterEntity){
        return TheaterDto.builder().city(theaterEntity.getCity()).name(theaterEntity.getName()).
                address(theaterEntity.getAddress()).type(theaterEntity.getType()).build();
    }


}
