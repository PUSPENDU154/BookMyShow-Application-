package com.example.BookMyshow.Repository;

import com.example.BookMyshow.Model.TheaterSeatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterSeatsRepository extends JpaRepository<TheaterSeatsEntity,Integer> {
}
