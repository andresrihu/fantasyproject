package com.fantasy.backend.repositories;

import java.util.ArrayList;
import java.util.Optional;

import com.fantasy.backend.models.Athlete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AthleteRepository extends CrudRepository<Athlete, Long> {

    Optional<Athlete> findByName(String name);

    ArrayList<Athlete> findAll();

    ArrayList<Athlete> findByPos(String pos);

}
