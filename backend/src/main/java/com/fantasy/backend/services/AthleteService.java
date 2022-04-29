package com.fantasy.backend.services;

import java.util.ArrayList;
import java.util.HashMap;
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
    // DO NOT CREATE BEFORE TEAMS ARE POPULATED
    public void create(ArrayList<Athlete> athletes) {
        HashMap<String, String> teams = new HashMap<String, String>();
        teams.put("WAS", "Washington Football Team");
        teams.put("TEN", "Tennessee Titans");
        teams.put("TAM", "Tampa Bay Buccaneers");
        teams.put("SFO", "San Francisco 49ers");
        teams.put("SEA", "Seattle Seahawks");
        teams.put("PIT", "Pittsburgh Steelers");
        teams.put("PHI", "Philadelphia Eagles");
        teams.put("NYJ", "New York Jets");
        teams.put("NYG", "New York Giants");
        teams.put("NWE", "New England Patriots");
        teams.put("NOR", "New Orleans Saints");
        teams.put("MIN", "Minnesota Vikings");
        teams.put("MIA", "Miami Dolphins");
        teams.put("LVR", "Las Vegas Raiders");
        teams.put("LAR", "Los Angeles Rams");
        teams.put("LAC", "Los Angeles Chargers");
        teams.put("KAN", "Kansas City Chiefs");
        teams.put("JAX", "Jacksonville Jaguars");
        teams.put("IND", "Indianapolis Colts");
        teams.put("HOU", "Houston Texans");
        teams.put("GNB", "Green Bay Packers");
        teams.put("DET", "Detroit Lions");
        teams.put("DEN", "Denver Broncos");
        teams.put("DAL", "Dallas Cowboys");
        teams.put("CLE", "Cleveland Browns");
        teams.put("CIN", "Cincinnati Bengals");
        teams.put("CHI", "Chicago Bears");
        teams.put("CAR", "Carolina Panthers");
        teams.put("BUF", "Buffalo Bills");
        teams.put("BAL", "Baltimore Ravens");
        teams.put("ATL", "Atlanta Falcons");
        teams.put("ARI", "Arizona Cardinals");

        for (int i = 0; i < athletes.size(); i++) {
            Optional<Team> teamCheck = (Optional<Team>) tr
                    .findByName(teams.get(athletes.get(i).getTeam().substring(0, 3)));

            if (teamCheck.isPresent()) {
                Team newTeam = teamCheck.get();
                athletes.get(i).setTeamDb(newTeam);
                ar.save(athletes.get(i));
            }
        }
    }

    // Read
    public ArrayList<Athlete> readAll() {
        return ar.findAll();
    }

    public Athlete readById(Long id) {
        Optional<Athlete> searched = ar.findById(id);

        if (searched.isPresent()) {
            return searched.get();
        }

        return null;
    }
    // Update
    // Delete

}
