package com.fantasy.backend.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fantasy.backend.services.UserService;

@RestController
public class UserLeagueController {
	
	
	@Autowired
	private UserService userService;
	
	public UserLeagueController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/leagueteam")
	public String leagueTeam(Model model, HttpSession session) {
		
		
		if(!userService.isLoggedIN(session)) return "redirect:/";
		return "LeagueTeamInfo";
	}
}
