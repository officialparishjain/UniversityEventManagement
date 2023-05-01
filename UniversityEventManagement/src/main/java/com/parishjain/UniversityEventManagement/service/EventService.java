package com.parishjain.UniversityEventManagement.service;

import com.parishjain.UniversityEventManagement.models.Event;
import com.parishjain.UniversityEventManagement.models.Student;
import com.parishjain.UniversityEventManagement.repository.IEventRepository;
import com.parishjain.UniversityEventManagement.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {


    @Autowired
    IEventRepository eventRepository;

    public String saveEvents(List<Event> events) {
        Iterable<Event> eventList = eventRepository.saveAll(events);
        if(eventList != null) return "Added";
        else return "Not Added, Please Check...";
    }

    public String updateEventLocationById(String location, Integer id) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if(optionalEvent.isPresent()){
            Event event = optionalEvent.get();
            event.setEventLocation(location);
            eventRepository.save(event);
            return "Updated";
        }
        else return "Not Updated...";
    }

    public String deleteEventById(Integer id) {
        eventRepository.deleteById(id);
        return "Deleted";
    }


    public Iterable<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
