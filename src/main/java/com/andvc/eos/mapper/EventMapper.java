package com.andvc.eos.mapper;

import com.andvc.eos.domain.Event;
import com.andvc.eos.dto.EventRequestDTO;
import com.andvc.eos.dto.EventResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {
    public EventResponseDTO toDTO(Event event) {
        return new EventResponseDTO(
                event.getId(),
                event.getName(),
                event.getDate(),
                event.getStatus()
        );
    }

    public Event toEntity(EventRequestDTO dto) {
        Event event = new Event();
        event.setName(dto.name());
        event.setDate(dto.date());
        event.setStatus(dto.status());

        return event;
    }
}
