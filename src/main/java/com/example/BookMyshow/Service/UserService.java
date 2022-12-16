package com.example.BookMyshow.Service;

import com.example.BookMyshow.dto.UserDto;

public interface UserService {
    //add
    public UserDto addUser(UserDto userDto);

    //get
    public UserDto getUser(int id);
}
