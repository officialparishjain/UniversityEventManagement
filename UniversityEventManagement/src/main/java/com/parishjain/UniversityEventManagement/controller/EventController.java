package com.parishjain.UniversityEventManagement.controller;

import com.parishjain.UniversityEventManagement.models.Event;
import com.parishjain.UniversityEventManagement.models.Student;
import com.parishjain.UniversityEventManagement.service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/univ/event")
public class EventController {

    /*
    Endpoints to provided :-
    Add event
    Update event
    Delete event
    Get All events by date

 */
    @Autowired
    EventService eventService;

    // Adding the Event
    @PostMapping(value = "/add")
    public String addEvent(@RequestBody List<Event> events){
        return eventService.saveEvents(events);
    }

    // Update the Event Location
    @PutMapping(value = "/update/location/{location}/id/{id}")
    public String updateEventLocation(@PathVariable String location , @PathVariable Integer id){
        return eventService.updateEventLocationById(location,id);
    }

    // delete Event
    @DeleteMapping(value = "/delete/id/{id}")
    public String deleteEventById(@PathVariable Integer id){
        return eventService.deleteEventById(id);
    }

    // Get Events
    @GetMapping(value = "/all")
    public Iterable<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

}
