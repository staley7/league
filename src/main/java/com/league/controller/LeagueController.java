package com.league.controller;

import com.league.model.League;
import com.league.service.LeagueService;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;


@RestController
@RequestMapping("/api")
public class LeagueController {
    private LeagueService leagueService;

    public LeagueController(LeagueService leagueService){
        this.leagueService = leagueService;
    }

    @GetMapping("/league/{leagueId}")
    public League getLeague(@PathVariable("leagueId") Long leagueId){
        return leagueService.getLeague(leagueId);
    }

    @GetMapping("/leagues")
    public Set<League> getLeagues(){
        return new HashSet<>(leagueService.getLeagues());
    }

    @PostMapping("/league")
    public League createLeague(@RequestBody League league){
        return leagueService.saveLeague(league);
    }

    @PutMapping("/league")
    public League updateLeague(@RequestBody League league){
        return leagueService.saveLeague(league);
    }


}
