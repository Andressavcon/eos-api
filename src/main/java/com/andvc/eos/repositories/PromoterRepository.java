package com.andvc.eos.repositories;

import com.andvc.eos.domain.Promoter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PromoterRepository extends JpaRepository<Promoter, UUID> {}
