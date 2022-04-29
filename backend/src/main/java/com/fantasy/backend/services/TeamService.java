package com.fantasy.backend.services;

import java.util.ArrayList;

import com.fantasy.backend.models.Team;
import com.fantasy.backend.repositories.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository tr;

    public TeamService(TeamRepository tr) {
        this.tr = tr;
    }

    // Create
    public void create(ArrayList<Team> teams) {
        for (int i = 0; i < teams.size(); i++) {
            tr.save(teams.get(i));
        }
    }

    // Read
    public ArrayList<Team> readAll() {
        return tr.findAll();
    }
    // Update
    // Delete

}
