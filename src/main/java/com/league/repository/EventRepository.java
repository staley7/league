package com.league.repository;

import com.league.model.Event;
import com.league.model.League;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface EventRepository extends JpaRepository<Event, Long> {


    Set<Event> findEventsByLeagueId(Long leagueId);
}
