package com.example.BookMyshow.dto;

import com.example.BookMyshow.enums.TheaterType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheaterDto {

    private int id;

    private String name;

    private String city;

    private String address;

    private TheaterType type;

    ShowDto showDto;

}
