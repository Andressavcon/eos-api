package com.andvc.eos.domain;

import com.andvc.eos.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "finances")
@Getter
@Setter
public class Finance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private String description;
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private TransactionType type;
}