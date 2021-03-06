package com.league.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class League {
    @Id
    @GeneratedValue
    private Long leagueId;
    private String leagueName;
    private String rules;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDateTime createTime;
    private List<Event> eventList;
    private List<Member> memberList;
}
