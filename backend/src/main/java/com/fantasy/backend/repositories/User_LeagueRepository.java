package com.fantasy.backend.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fantasy.backend.models.User_League;

@Repository
public interface User_LeagueRepository extends CrudRepository<User_League, Long>{

    List<User_League> findAll();

}