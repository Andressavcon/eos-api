package com.andvc.eos.repositories;

import com.andvc.eos.domain.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VoucherRepository extends JpaRepository<Voucher, UUID> {}
