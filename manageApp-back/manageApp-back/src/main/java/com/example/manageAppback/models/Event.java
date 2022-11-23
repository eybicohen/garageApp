package com.example.manageAppback.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @Column(name = "event_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private Integer eventId;

    @Column(name = "type")
    @JsonProperty
    private String type;

    @Column(name = "content")
    @JsonProperty
    private String content;

    @Column(name = "date")
    @JsonProperty
    private LocalDate date;

    @Column(name = "time")
    @JsonProperty
    private LocalTime time;

    @JsonProperty
    @JoinColumn(name = "user_id")
    @ManyToOne(targetEntity = User.class)
    private User userId;

    public LocalDate getDate() {
        return this.date;
    }
}
