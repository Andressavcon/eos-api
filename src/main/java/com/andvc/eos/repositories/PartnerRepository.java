package com.andvc.eos.repositories;

import com.andvc.eos.domain.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PartnerRepository extends JpaRepository<Partner, UUID> {}
