package com.example.BookMyshow.dto;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private int id;

    @NonNull
    private String name;

    @NonNull
    private String mobile;
}
