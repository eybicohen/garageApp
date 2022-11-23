package com.example.manageAppback.services;

import com.example.manageAppback.models.Event;
import com.example.manageAppback.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAll() {
        return this.eventRepository.findAll();
    }

    public Event getById(Integer id) {
        return this.eventRepository.findById(id).get();
    }

    public List<Event> getAllByUserId(Integer userId) {
        return this.eventRepository.findByUserId_Id(userId);
    }

    public List<Event> getAllByUserIdAndDate(String date, Integer userId) {
        List<Event> eventList = this.getAllByUserId(userId);
        LocalDate localDate = LocalDate.parse(date);
        eventList = eventList.stream().filter(event -> event.getDate().isEqual(localDate)).collect(Collectors.toList());

        return eventList;
    }

    public void addEvent(Event newEvent) {
        this.eventRepository.save(newEvent);
    }

    public void deleteEvent(Integer id) {
        this.eventRepository.deleteById(id);
    }
}
