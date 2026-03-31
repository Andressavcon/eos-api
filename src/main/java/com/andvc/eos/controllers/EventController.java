package com.andvc.eos.controllers;

import com.andvc.eos.dto.EventRequestDTO;
import com.andvc.eos.dto.EventResponseDTO;
import com.andvc.eos.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired private EventService eventService;

    @GetMapping
    public ResponseEntity<List<EventResponseDTO>> getAllEvents() {
        List<EventResponseDTO> response = eventService.findAll();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<EventResponseDTO> createEvent(@RequestBody EventRequestDTO dto) {
        EventResponseDTO response = eventService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventResponseDTO> getById(@PathVariable UUID id) {
        return ResponseEntity.ok(eventService.findById(id));
    }
}