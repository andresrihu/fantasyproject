package com.fantasy.backend.repositories;

import com.fantasy.backend.models.Team;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
    
}