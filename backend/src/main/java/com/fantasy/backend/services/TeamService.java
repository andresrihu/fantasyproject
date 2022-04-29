package com.fantasy.backend.services;

import java.util.ArrayList;
import java.util.Optional;

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
// <<<<<<< HEAD
    public ArrayList<Team> readAll() {
        return tr.findAll();
    }
// =======
    public Team showTeam(Long id){
        Optional<Team> team = tr.findById(id);

        return team.isPresent()?team.get():null;
// >>>>>>> 387fa2b2f5a3e760cd0b62cb4a14af37bd857aea
    }
    // Update
    public Team updateTeam(Team t){
        return tr.save(t);
    }
    // All Teams
    public ArrayList<Team> allTeams(){
        return (ArrayList<Team>) tr.findAll();
    }


}
