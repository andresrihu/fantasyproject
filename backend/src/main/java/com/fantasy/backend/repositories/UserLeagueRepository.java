package com.fantasy.backend.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fantasy.backend.models.UserLeague;

@Repository
public interface UserLeagueRepository extends CrudRepository<UserLeague, Long>{

    List<UserLeague> findAll();

}