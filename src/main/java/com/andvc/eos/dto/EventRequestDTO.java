package com.andvc.eos.dto;

import com.andvc.eos.enums.EventStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record EventRequestDTO(
        String name,
        LocalDateTime date,
        EventStatus status
) {}
