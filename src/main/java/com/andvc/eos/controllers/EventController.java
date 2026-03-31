package com.andvc.eos.controllers;

import com.andvc.eos.domain.Event;
import com.andvc.eos.dto.EventRequestDTO;
import com.andvc.eos.dto.EventResponseDTO;
import com.andvc.eos.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired private EventService eventService;

    @GetMapping
    public List<EventResponseDTO> getAllEvents() {
        return eventService.findAll();
    }

    @PostMapping
    public EventResponseDTO createEvent(@RequestBody EventRequestDTO dto) {
        return eventService.create(dto);
    }
}