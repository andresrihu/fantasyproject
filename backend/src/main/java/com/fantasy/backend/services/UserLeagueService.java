package com.fantasy.backend.services;

import java.util.ArrayList;
import java.util.Optional;

import com.fantasy.backend.models.UserLeague;
import com.fantasy.backend.repositories.UserLeagueRepository;

import org.springframework.stereotype.Service;

@Service
public class UserLeagueService {
    private final UserLeagueRepository userLeagueRepository;

    public UserLeagueService(UserLeagueRepository userLeagueRepository){
        this.userLeagueRepository = userLeagueRepository;
    }

    // Create User League
    public void createUserLeague(UserLeague userLeague){
        userLeagueRepository.save(userLeague);
    }

    // Read One User League
    public UserLeague findUserLeague(Long id){
        Optional<UserLeague> optUserLeague = userLeagueRepository.findById(id);
        if(optUserLeague.isPresent()){
            return optUserLeague.get();
        } else {
            return null;
        }
    }

    // Read all User Leagues
    public ArrayList<UserLeague> allUserLeagues(){
        return (ArrayList<UserLeague>) userLeagueRepository.findAll();
    }

    // Update User League
    public void updateUserLeague(UserLeague userLeague){
        userLeagueRepository.save(userLeague);
    }

    // Delete User League
    public void deleteUserLeague(Long id){
        userLeagueRepository.deleteById(id);
    }
}
