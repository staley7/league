package com.league.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Member {

    private Long memberId;
    private String firstName;
    private String lastName;
    private String nickName;
    private Boolean active;
    private Long leagueWins;
    private Long eventWins;
    private Long seasonActive;
    private LocalDateTime createTime;



}