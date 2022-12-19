package com.example.BookMyshow.Service;

import com.example.BookMyshow.dto.EntryDto.TheaterEntryDto;
import com.example.BookMyshow.dto.ResponseDto.TheaterResponseDto;

public interface TheaterService {


    TheaterResponseDto addTheater(TheaterEntryDto theaterEntryDto);

    TheaterResponseDto getTheater(int id);

}