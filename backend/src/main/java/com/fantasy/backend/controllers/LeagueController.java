package com.fantasy.backend.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	@Autowired
	private UserService userService;
	
	public LeagueController(LeagueService leagueService, UserService userService ) {
		this.leagueService = leagueService;
		this.userService = userService;
	}
		
	@PostMapping("/createLeague")
	public String league_create (
			@RequestParam(name="leaguename") String leaguename,
			@RequestParam(name="maxteams") String maxteams,
			@RequestParam(name="typeofscoring") String typeofscoring,
			@RequestParam(name="passingtdpts") String passingtdpts,
			@RequestParam(name="passingydspts") String passingydspts,
			@RequestParam(name="rushingtdspts") String rushingtdspts,
			@RequestParam(name="rushingydspts") String rushingydspts,
			@RequestParam(name="receptionspts") String receptionspts,
			@RequestParam(name="receivingydspts") String receivingydspts,
			@RequestParam(name="receivingtdspts") String receivingtdspts,
			@RequestParam(name="twoptconvptsdspts") String twoptconvptsdspts,
			@RequestParam(name="fumbleslostpts") String fumbleslostpts,
			@RequestParam(name="fieldgoals019pts") String fieldgoals019pts,
			@RequestParam(name="fieldgoals2029pts") String fieldgoals2029pts,
			@RequestParam(name="fieldgoals3039pts") String fieldgoals3039pts,
			@RequestParam(name="fieldgoals4049pts") String fieldgoals4049pts,
			@RequestParam(name="fieldgoals50pluspts") String fieldgoals50pluspts,
			@RequestParam(name="pointsallowed0pts") String pointsallowed0pts,
			@RequestParam(name="pointsallowed16pts") String pointsallowed16pts,
			@RequestParam(name="pointsallowed713pts") String pointsallowed713pts,
			@RequestParam(name="pointsallowed1420pts") String pointsallowed1420pts,
			@RequestParam(name="pointsallowed2127pts") String pointsallowed2127pts,
			@RequestParam(name="pointsallowed2834pts") String pointsallowed2834pts,
			@RequestParam(name="pointsallowed35pluspts") String pointsallowed35pluspts,
			@RequestParam(name="pdefinterceptionpts") String pdefinterceptionpts,
			@RequestParam(name="fumblerecovpts") String fumblerecovpts,
			@RequestParam(name="deftdpts") String deftdpts,
			@RequestParam(name="safetypts") String safetypts,
			@RequestParam(name="blockedkickpts") String blockedkickpts,
			@RequestParam(name="specialteamstdpts") String specialteamstdpts,
			@RequestParam(name="extraptsretpts") String extraptsretpts,
			
			
			HttpSession session
	) {
		if(!UserService.IsLoggedIn(session)) return UserService.Deny();
		League leagueVar = new League();
		leagueVar.setLeague_name(leaguename);
		
		leagueService.createLeague(leagueVar);
		
		return "redirect:/fanatasyhome";
	}
}
