package com.league.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long memberId;
    private String userName;
    private String firstName;
    private String lastName;
    private String nickname;
    private Boolean active;
    private Long leagueWins;
    private Long eventWins;
    private Long seasonActive;
    private LocalDateTime createTime;



}