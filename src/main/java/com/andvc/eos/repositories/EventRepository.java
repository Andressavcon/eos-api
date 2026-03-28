package com.andvc.eos.repositories;
import com.andvc.eos.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {}
