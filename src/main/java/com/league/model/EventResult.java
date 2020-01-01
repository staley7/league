package com.league.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class EventResult {
    @Id
    @GeneratedValue
    private Long eventResultId;
    private Long eventId;
    private LocalDateTime createTime;
    private Long memberId;
    private Long place;

}
