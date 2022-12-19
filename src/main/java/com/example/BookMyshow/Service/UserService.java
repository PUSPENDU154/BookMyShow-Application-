package com.example.BookMyshow.Service;

import com.example.BookMyshow.dto.EntryDto.UserEntryDto;
import com.example.BookMyshow.dto.ResponseDto.UserResponseDto;

public interface UserService { //Designing part

    void addUser(UserEntryDto userEntryDto);

    UserResponseDto getUser(int id);


}