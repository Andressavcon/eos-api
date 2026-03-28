package com.andvc.eos.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "sales")
@Getter
@Setter
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "promoter_id")
    private Promoter promoter;

    private BigDecimal totalValue;
    private LocalDateTime saleDate;
    private String paymentMethod;
}