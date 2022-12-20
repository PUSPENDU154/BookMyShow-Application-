package com.example.BookMyshow.Controller;

import com.example.BookMyshow.Service.TheaterService;
import com.example.BookMyshow.Service.impl.TheaterServiceImpl;
import com.example.BookMyshow.dto.EntryDto.TheaterEntryDto;
import com.example.BookMyshow.dto.ResponseDto.TheaterResponseDto;
import com.example.BookMyshow.dto.ResponseDto.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("theater")
public class TheaterController {

    @Autowired
    TheaterServiceImpl theaterService;


    @PostMapping("add")
    public TheaterResponseDto addTheater(@RequestBody() TheaterEntryDto theaterEntryDto){

        return theaterService.addTheater(theaterEntryDto);

    }


    @GetMapping("{id}")
    public ResponseEntity<TheaterResponseDto> getTheater(@PathVariable(value = "name")int id){

        TheaterResponseDto theaterResponseDto = theaterService.getTheater(id);

        return new ResponseEntity<>(theaterResponseDto, HttpStatus.OK);
    }

}