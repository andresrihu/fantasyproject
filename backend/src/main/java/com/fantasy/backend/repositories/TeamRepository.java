package com.fantasy.backend.repositories;

import java.util.ArrayList;
import java.util.Optional;
import com.fantasy.backend.models.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

    Optional<Team> findByName(String name);

    ArrayList<Team> findAll();

    ArrayList<Team> findByNameContains(String search);

    

}