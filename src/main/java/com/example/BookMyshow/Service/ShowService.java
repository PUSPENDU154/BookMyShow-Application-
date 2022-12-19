package com.example.BookMyshow.Service;

import com.example.BookMyshow.dto.EntryDto.ShowEntryDto;
import com.example.BookMyshow.dto.ResponseDto.ShowResponseDto;

public interface ShowService {

    ShowResponseDto addShow(ShowEntryDto showEntryDto);

    //Get show
    //Complete
}