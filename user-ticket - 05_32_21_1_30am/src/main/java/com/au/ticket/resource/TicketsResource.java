package com.au.ticket.resource;


import com.au.ticket.model.Tickets;
import com.au.ticket.repository.TicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/rest/tickets")
public class TicketsResource {

    @Autowired
    TicketsRepository ticketsRepository;

    @GetMapping(value = "/all")
    public List<Tickets> getAll() {
        return ticketsRepository.findAll();
    }
    
   
    @GetMapping(value = "/byid/{id}")
    public Optional<Tickets> getbyid(@PathVariable int id) {
        return ticketsRepository.findByticketid(id);
    }

  

}