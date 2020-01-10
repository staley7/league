package com.league.service;

import com.league.model.League;
import com.league.repository.LeagueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class LeagueService {

    private LeagueRepository leagueRepository;

    public LeagueService(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    public League getLeague(Long leagueId) {
        return leagueRepository.findById(leagueId).orElse(null);
    }

    public List<League> getLeagues() {
        return leagueRepository.findAll();
    }

    public League saveLeague(League league) {
        return  leagueRepository.save(league);
    }
}
