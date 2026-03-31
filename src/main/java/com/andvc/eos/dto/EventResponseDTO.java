package com.andvc.eos.dto;

import com.andvc.eos.enums.EventStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record EventResponseDTO(
        UUID id,
        String name,
        LocalDateTime date,
        EventStatus status
) {}
