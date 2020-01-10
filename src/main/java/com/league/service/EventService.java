package com.league.service;

import com.league.model.Event;
import com.league.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EventService {
    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    public Event getEvent(Long eventId) {
       return eventRepository.findById(eventId).orElse(null);
    }

    public Set<Event> getEventsByLeague(Long leagueId) {
        return eventRepository.findEventsByLeagueId(leagueId);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Event event) {
        return eventRepository.save(event);
    }
}
