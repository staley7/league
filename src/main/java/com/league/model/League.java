package com.league.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class League {

    private Long leagueId;
    private String leagueName;
    private LocalDate startDate;
    private LocalDate endDate;
    private
}
