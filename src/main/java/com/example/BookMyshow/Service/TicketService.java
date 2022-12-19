package com.example.BookMyshow.Service;

import com.example.BookMyshow.dto.BookTicketRequestDto;
import com.example.BookMyshow.dto.ResponseDto.TicketResponseDto;
import com.example.BookMyshow.dto.TicketDto;

public interface TicketService {


    TicketResponseDto getTicket(int id); //H.W (Hint is same as you do in GetMovie)

    TicketResponseDto bookTicket(BookTicketRequestDto bookTicketRequestDto);

}