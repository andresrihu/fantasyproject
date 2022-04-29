package com.fantasy.backend.controllers;

import java.util.ArrayList;

import com.fantasy.backend.models.Athlete;
import com.fantasy.backend.services.AthleteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AthleteController {

    @Autowired
    private AthleteService as;

    public AthleteController(AthleteService as) {
        this.as = as;
    }

    @RequestMapping("/athletes")
    public ArrayList<Athlete> activeAthletes() {

        ArrayList<Athlete> activeAthletes = as.readAll();

        return activeAthletes;
    }

    @RequestMapping("/athletes/{id}")
    public Athlete searchedAthlete(@PathVariable("id") Long id) {

        Athlete searchedAthlete = as.readById(id);

        return searchedAthlete;

    }

    @RequestMapping("/athletes/search/{search}")
    public ArrayList<Athlete> athleteSearchResult(@PathVariable("search") String search) {
        return as.readBySearch(search);
    }

}
