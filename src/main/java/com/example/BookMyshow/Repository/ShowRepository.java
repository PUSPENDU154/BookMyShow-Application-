package com.example.BookMyshow.Repository;

import com.example.BookMyshow.Model.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {
}
