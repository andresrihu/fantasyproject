package com.fantasy.backend.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fantasy.backend.models.League;
import com.fantasy.backend.services.LeagueService;
import com.fantasy.backend.services.UserService;

@RestController
public class LeagueController {
	@Autowired
	private LeagueService leagueService;
	
	public LeagueController(LeagueService leagueService) {
		this.leagueService = leagueService;
	}
		
	
}
