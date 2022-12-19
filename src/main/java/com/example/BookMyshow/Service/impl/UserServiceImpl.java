package com.example.BookMyshow.Service.impl;

import com.example.BookMyshow.Model.UserEntity;
import com.example.BookMyshow.Repository.UserRepository;
import com.example.BookMyshow.Service.UserService;
import com.example.BookMyshow.converter.UserConverter;
import com.example.BookMyshow.dto.EntryDto.UserEntryDto;
import com.example.BookMyshow.dto.EntryDto.UserEntryDto;
import com.example.BookMyshow.dto.ResponseDto.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserEntryDto userEntryDto) {

        UserEntity userEntity = UserConverter.convertDtoToEntity(userEntryDto); //Cleaner
        userRepository.save(userEntity);
    }

    @Override
    public UserResponseDto getUser(int id) {

        UserEntity user = new UserEntity(); //By default user.

        UserEntity userEntity = userRepository.findById(id).get();

        UserResponseDto userResponseDto = UserConverter.convertEntityToDto(userEntity);

        return userResponseDto;
    }
}