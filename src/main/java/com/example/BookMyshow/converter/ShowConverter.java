package com.example.BookMyshow.converter;

import com.example.BookMyshow.Model.ShowEntity;
import com.example.BookMyshow.dto.ShowDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShowConverter {

    public static ShowEntity dtoToEntity(ShowDto showDto){
        return  ShowEntity.builder().id(showDto.getId()).showTime(showDto.getShowTime()).showDate(showDto.getShowDate()).build();
    }
}
