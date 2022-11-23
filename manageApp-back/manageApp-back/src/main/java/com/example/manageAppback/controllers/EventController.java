package com.example.manageAppback.controllers;

import com.example.manageAppback.models.Event;
import com.example.manageAppback.models.User;
import com.example.manageAppback.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/events")
@CrossOrigin
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("")
    public List<Event> getAll() {
        return this.eventService.getAll();
    }

    @GetMapping("/{id}")
    public Event getById(@PathVariable Integer id) {
        return this.eventService.getById(id);
    }

    @GetMapping("/user/{userId}")
    public List<Event> getAllByUserId(@PathVariable Integer userId) {
        return this.eventService.getAllByUserId(userId);
    }

    @GetMapping("/{id}/{date}")
    public List<Event> getAllByUserIdAndDate(@PathVariable Integer id, @PathVariable String date) {
        return this.eventService.getAllByUserIdAndDate(date, id);
    }

    @PostMapping("")
    public void addEvent(@RequestBody Event newEvent) {
        this.eventService.addEvent(newEvent);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Integer id) {
        this.eventService.deleteEvent(id);
    }
}
