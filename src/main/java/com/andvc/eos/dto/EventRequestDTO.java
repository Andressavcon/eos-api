package com.andvc.eos.dto;

import com.andvc.eos.enums.EventStatus;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

public record EventRequestDTO(
        @NotBlank(message = "Event name cannot be blank")
        String name,

        @NotNull(message = "Event date is required")
        @Future(message = "Event date must be in the future")
        LocalDateTime date,

        @NotNull(message = "Event status is required")
        EventStatus status
) {}
