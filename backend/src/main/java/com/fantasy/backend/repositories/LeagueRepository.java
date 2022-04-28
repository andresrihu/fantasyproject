package com.fantasy.backend.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fantasy.backend.models.League;

@Repository
public interface LeagueRepository extends CrudRepository<League, Long>{
    // this method retrieves all the Leagues from the database
    List<League> findAll();
//    List<League> findByDescriptionContaining(String search);
}