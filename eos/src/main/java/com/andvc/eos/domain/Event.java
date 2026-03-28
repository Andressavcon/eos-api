package com.andvc.eos.domain;

import com.andvc.eos.enums.EventStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "events")
@Getter
@Setter
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private LocalDateTime date;
    private String location;

    @Enumerated(EnumType.STRING)
    private EventStatus status;
}
