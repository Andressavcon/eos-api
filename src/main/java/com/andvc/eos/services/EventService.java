package com.andvc.eos.services;

import com.andvc.eos.domain.Event;
import com.andvc.eos.dto.EventRequestDTO;
import com.andvc.eos.dto.EventResponseDTO;
import com.andvc.eos.mapper.EventMapper;
import com.andvc.eos.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventService {

    @Autowired private EventRepository eventRepository;
    @Autowired private EventMapper eventMapper;

    public List<EventResponseDTO> findAll() {
        List<Event> events = eventRepository.findAll();

        return events.stream()
                .map(eventMapper::toDTO)
                .toList();
    }

    public Event save(Event event) {
        return eventRepository.save(event);
    }

    public EventResponseDTO create(EventRequestDTO dto) {
        Event event = eventMapper.toEntity(dto);
        Event savedEvent = eventRepository.save(event);

        return eventMapper.toDTO(savedEvent);
    }
}
