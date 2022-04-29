package com.fantasy.backend.controllers;

import java.util.ArrayList;

import com.fantasy.backend.models.Team;
import com.fantasy.backend.services.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    private TeamService ts;

    public TeamController(TeamService ts) {
        this.ts = ts;
    }

    @RequestMapping("/teams")
    public ArrayList<Team> getTeams() {
        return (ArrayList<Team>) ts.readAll();
    }

}
