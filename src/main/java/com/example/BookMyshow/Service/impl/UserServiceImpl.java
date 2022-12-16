package com.example.BookMyshow.Service.impl;

import com.example.BookMyshow.Model.UserEntity;
import com.example.BookMyshow.Repository.UserRepository;
import com.example.BookMyshow.Service.UserService;
import com.example.BookMyshow.converter.UserConverter;
import com.example.BookMyshow.dto.UserDto;
import org.apache.catalina.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDto addUser(UserDto userDto){

        UserEntity userEntity = UserConverter.dtoToEntity(userDto);

        userRepository.save(userEntity);

        return userDto;
    }
    @Override
    public UserDto getUser(int id){
        UserEntity userEntity=userRepository.findById(id).get();
        UserDto userDto=UserConverter.entityToDto(userEntity);
        return userDto;
    }
}
