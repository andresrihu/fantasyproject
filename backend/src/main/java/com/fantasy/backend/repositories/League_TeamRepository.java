package com.fantasy.backend.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fantasy.backend.models.League_Team;

@Repository
public interface League_TeamRepository extends CrudRepository<League_Team, Long>{

    List<League_Team> findAll();

}