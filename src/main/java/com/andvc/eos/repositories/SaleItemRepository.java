package com.andvc.eos.repositories;

import com.andvc.eos.domain.SaleItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SaleItemRepository extends JpaRepository<SaleItem, UUID> {}
