package com.example.BookMyshow.Service;

import com.example.BookMyshow.dto.TheaterDto;

public interface TheaterService {

    public void addTheater(TheaterDto theaterDto);

    public TheaterDto getTheater(int id);
}
