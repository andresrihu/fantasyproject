package com.fantasy.backend.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fantasy.backend.models.Athlete;
import com.fantasy.backend.models.League;
import com.fantasy.backend.services.AthleteService;
import com.fantasy.backend.services.Converter;
import com.fantasy.backend.services.LeagueService;
import com.fantasy.backend.services.TeamService;

@Controller
public class MainController implements ErrorController {

    @Autowired
    private AthleteService as;

    @Autowired
    private TeamService ts;
    
    @Autowired
	private LeagueService leagueService;
    
    
	

    private Converter converter = new Converter("teams");

    public MainController(AthleteService as, TeamService ts, LeagueService leagueService) {
        this.as = as;
        this.ts = ts;
        this.leagueService = leagueService;
    }

    @GetMapping(value = { "/" })
    public String index() {
        return "forward:/index.html";
    }

    @GetMapping("/error")
    public String errorMap() {
        return "redirect:/";
    }

    @PostMapping("/add_athletes")
    public String addAthletes() {
    System.out.println("TEST TEST TEST");
    // ArrayList<Team> teams = converter.getTeams();
    // ts.create(teams);
    converter.setFileName("playerlist");
    ArrayList<Athlete> athletes = converter.convertPlayerData();
    as.create(athletes);
    return "redirect:/";
    }
    
    @PostMapping("/createLeague")
	public String league_create (
			@RequestParam(name="leaguename") String leaguename,
			@RequestParam(name="maxteams") Integer maxteams,
			@RequestParam(name="typeofscoring") Integer typeofscoring,
			@RequestParam(name="passingtdpts") Integer passingtdpts,
			@RequestParam(name="passingydspts") Integer passingydspts,
			@RequestParam(name="rushingtdspts") Integer rushingtdspts,
			@RequestParam(name="rushingydspts") Integer rushingydspts,
			@RequestParam(name="receptionspts") Integer receptionspts,
			@RequestParam(name="receivingydspts") Integer receivingydspts,
			@RequestParam(name="receivingtdspts") Integer receivingtdspts,
			@RequestParam(name="twoptconvptsdspts") Integer twoptconvptsdspts,
			@RequestParam(name="fumbleslostpts") Integer fumbleslostpts,
			@RequestParam(name="fieldgoals019pts") Integer fieldgoals019pts,
			@RequestParam(name="fieldgoals2029pts") Integer fieldgoals2029pts,
			@RequestParam(name="fieldgoals3039pts") Integer fieldgoals3039pts,
			@RequestParam(name="fieldgoals4049pts") Integer fieldgoals4049pts,
			@RequestParam(name="fieldgoals50pluspts") Integer fieldgoals50pluspts,
			@RequestParam(name="pointsallowed0pts") Integer pointsallowed0pts,
			@RequestParam(name="pointsallowed16pts") Integer pointsallowed16pts,
			@RequestParam(name="pointsallowed713pts") Integer pointsallowed713pts,
			@RequestParam(name="pointsallowed1420pts") Integer pointsallowed1420pts,
			@RequestParam(name="pointsallowed2127pts") Integer pointsallowed2127pts,
			@RequestParam(name="pointsallowed2834pts") Integer pointsallowed2834pts,
			@RequestParam(name="pointsallowed35pluspts") Integer pointsallowed35pluspts,
			@RequestParam(name="pdefinterceptionpts") Integer pdefinterceptionpts,
			@RequestParam(name="fumblerecovpts") Integer fumblerecovpts,
			@RequestParam(name="deftdpts") Integer deftdpts,
			@RequestParam(name="safetypts") Integer safetypts,
			@RequestParam(name="blockedkickpts") Integer blockedkickpts,
			@RequestParam(name="specialteamstdpts") Integer specialteamstdpts,
			@RequestParam(name="extraptsretpts") Integer extraptsretpts,
			
			
			HttpSession session
	) {
//		if(!UserService.IsLoggedIn(session)) return UserService.Deny();
		League leagueVar = new League();
		leagueVar.setLeague_name(leaguename);
		
		leagueService.createLeague(leagueVar);
		
		return "redirect:/";
	}

}
