package com.fantasy.backend.services;

import java.util.ArrayList;
import java.util.Optional;

import com.fantasy.backend.models.League;
import com.fantasy.backend.repositories.LeagueRepository;

import org.springframework.stereotype.Service;

@Service
public class LeagueService {
    private final LeagueRepository leagueRepository;

    public LeagueService(LeagueRepository leagueRepository){
        this.leagueRepository = leagueRepository;
    }

    //Create League
    public void createLeague(League league){
        leagueRepository.save(league);
    }

    //Read One League
    public League findLeague(Long id){
        Optional<League> optionalLeague = leagueRepository.findById(id);
        if(optionalLeague.isPresent()){
            return optionalLeague.get();
        } else{
            return null;
        }
    }

    // Read all Leagues
    public ArrayList<League> allLeagues(){
        return (ArrayList<League>) leagueRepository.findAll();
    }

    // Update League
    public void updateLeague(League league){
        leagueRepository.save(league);
    }

    // delete league
    public void deleteLeague(Long id){
        leagueRepository.deleteById(id);
    }
}
