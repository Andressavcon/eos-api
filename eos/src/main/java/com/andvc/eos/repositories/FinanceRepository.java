package com.andvc.eos.repositories;

import com.andvc.eos.domain.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FinanceRepository extends JpaRepository<Finance, UUID> {}
