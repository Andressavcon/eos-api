package com.andvc.eos.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "partners")
@Getter
@Setter
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    private BigDecimal equityShare;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}