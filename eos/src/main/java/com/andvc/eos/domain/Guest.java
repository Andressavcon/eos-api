package com.andvc.eos.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Entity
@Table(name = "guests")
@Getter
@Setter
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private String name;
    private String category;
    private boolean checkedIn = false;
}