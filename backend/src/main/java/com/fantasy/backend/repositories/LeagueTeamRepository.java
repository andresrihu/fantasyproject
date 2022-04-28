package com.fantasy.backend.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fantasy.backend.models.LeagueTeam;

@Repository
public interface LeagueTeamRepository extends CrudRepository<LeagueTeam, Long>{

    List<LeagueTeam> findAll();

}