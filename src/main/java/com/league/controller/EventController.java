package com.league.controller;

import com.league.model.Event;
import com.league.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api")
public class EventController {

    private EventService eventService;

    public  EventController(EventService eventService){
        this.eventService = eventService;
    }

    @GetMapping("/event/{eventId}")
    public Event getEvent(@PathVariable("eventId") Long eventId){
        return eventService.getEvent(eventId);
    }

    @GetMapping("/events/{leagueId}")
    public Set<Event> getEvents(@PathVariable("leagueId") Long leagueId){
        return eventService.getEventsByLeague(leagueId);
    }

    @PostMapping("/event")
    public Event createEvent(@RequestBody Event event){
        return  eventService.createEvent(event);
    }

    @PutMapping("/event")
    public Event updateEvent(@RequestBody Event event){
        return eventService.updateEvent(event);
    }
}
