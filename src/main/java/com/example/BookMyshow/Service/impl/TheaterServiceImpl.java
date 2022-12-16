package com.example.BookMyshow.Service.impl;

import com.example.BookMyshow.Model.TheaterEntity;
import com.example.BookMyshow.Model.TheaterSeatsEntity;
import com.example.BookMyshow.Repository.TheaterRepository;
import com.example.BookMyshow.Repository.TheaterSeatsRepository;
import com.example.BookMyshow.Service.TheaterService;
import com.example.BookMyshow.converter.TheaterConverter;
import com.example.BookMyshow.dto.TheaterDto;
import com.example.BookMyshow.enums.SeatType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TheaterServiceImpl implements TheaterService {

    @Autowired
    TheaterSeatsRepository theaterSeatsRepository;

    @Autowired
    TheaterRepository theaterRepository;

    @Override
    public void addTheater(TheaterDto theaterDto) {
        TheaterEntity theaterEntity= TheaterConverter.dtoToEntity(theaterDto);

        List<TheaterSeatsEntity> seats= createTheaterSeats();

        for(TheaterSeatsEntity theaterSeat: seats){
            theaterSeat.setTheater(theaterEntity);
        }

        theaterRepository.save(theaterEntity);
    }

    public List<TheaterSeatsEntity> createTheaterSeats(){

        List<TheaterSeatsEntity> seats = new ArrayList<>();


        seats.add(getTheaterSeat("1A",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1B",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1C",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1D",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1E",100,SeatType.CLASSIC));

        seats.add(getTheaterSeat("2A",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2B",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2C",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2D",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2E",200,SeatType.PREMIUM));

        theaterSeatsRepository.saveAll(seats);
        return seats;
    }

    public TheaterSeatsEntity getTheaterSeat(String seatNumber, int rate, SeatType seatType){
        return TheaterSeatsEntity.builder().seatNumber(seatNumber).rate(rate).seatType(seatType).build();
    }

    @Override
    public TheaterDto getTheater(int id) {

        TheaterEntity theaterEntity = theaterRepository.findById(id).get();

        TheaterDto theaterDto = TheaterConverter.entityToDto(theaterEntity);

        return theaterDto;
    }
}
