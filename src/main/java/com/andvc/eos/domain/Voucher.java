package com.andvc.eos.domain;

import com.andvc.eos.enums.VoucherStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Entity
@Table(name = "vouchers")
@Getter
@Setter
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(unique = true)
    private String token;

    @Enumerated(EnumType.STRING)
    private VoucherStatus status;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}