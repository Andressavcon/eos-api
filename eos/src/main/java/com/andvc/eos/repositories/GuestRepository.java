package com.andvc.eos.repositories;

import com.andvc.eos.domain.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GuestRepository extends JpaRepository<Guest, UUID> {}
