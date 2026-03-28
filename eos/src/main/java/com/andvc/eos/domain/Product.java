package com.andvc.eos.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private BigDecimal price;
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}