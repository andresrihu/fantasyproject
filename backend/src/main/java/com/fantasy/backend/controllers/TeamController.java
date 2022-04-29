package com.fantasy.backend.controllers;

import java.util.ArrayList;

import com.fantasy.backend.models.Team;
import com.fantasy.backend.services.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> 387fa2b2f5a3e760cd0b62cb4a14af37bd857aea
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
<<<<<<< HEAD

    @Autowired
    private TeamService ts;

    public TeamController(TeamService ts) {
        this.ts = ts;
    }

    @RequestMapping("/teams")
    public ArrayList<Team> getTeams() {
        return (ArrayList<Team>) ts.readAll();
    }

=======
    @Autowired
    private TeamService teamService;

    public TeamController(TeamService teamService){
        this.teamService = teamService;
    }

    @RequestMapping("/team")
    public ArrayList<Team> allTeams(){
        ArrayList<Team> allTeams = teamService.allTeams(); 
    return allTeams;   
    }

    @RequestMapping("/team/{id}")
    public Team searchTeam(@PathVariable("id") Long id){
        Team searchTeam = teamService.showTeam(id);
        return searchTeam;
    }


>>>>>>> 387fa2b2f5a3e760cd0b62cb4a14af37bd857aea
}
