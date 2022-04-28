package com.fantasy.backend.services;

import java.util.ArrayList;
import java.util.Optional;

import com.fantasy.backend.models.Athlete;
import com.fantasy.backend.models.Team;
import com.fantasy.backend.repositories.AthleteRepository;
import com.fantasy.backend.repositories.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AthleteService {

    @Autowired
    private AthleteRepository ar;

    @Autowired
    private TeamRepository tr;

    public AthleteService(AthleteRepository ar, TeamRepository tr) {
        this.ar = ar;
        this.tr = tr;
    }

    // Create
    // ATHLETE LIST TO ONLY BE CREATED ONCE TO FILL UP DATABASE
    // public void create(ArrayList<Athlete> athletes) {
    //     for (int i = 0; i < athletes.size(); i++) {
    //         Optional<Team> teamCheck = (Optional<Team>) tr.findByAthleteId(athletes.get(i).getId());

    //         if (teamCheck.isPresent()) {
    //             Team newTeam = teamCheck.get();
    //             athletes.get(i).setTeamDb(newTeam);
    //             ar.save(athletes.get(i));
    //         }
    //     }
    // }
    // Read
    // Update
    // Delete

}
