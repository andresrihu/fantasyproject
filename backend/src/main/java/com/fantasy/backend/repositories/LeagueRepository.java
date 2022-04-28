package com.fantasy.backend.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fantasy.backend.models.League;

@Repository
public interface LeagueRepository extends CrudRepository<League, Long>{
    
}