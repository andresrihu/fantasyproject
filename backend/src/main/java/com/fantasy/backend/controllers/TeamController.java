package com.fantasy.backend.controllers;

import java.util.ArrayList;

import com.fantasy.backend.models.Team;
import com.fantasy.backend.services.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @RequestMapping("/teams")
    public ArrayList<Team> allTeams() {
        ArrayList<Team> allTeams = teamService.allTeams();
        return allTeams;
    }

    @RequestMapping("/teams/{id}")
    public Team searchTeam(@PathVariable("id") Long id) {
        Team searchTeam = teamService.showTeam(id);
        return searchTeam;
    }
}
