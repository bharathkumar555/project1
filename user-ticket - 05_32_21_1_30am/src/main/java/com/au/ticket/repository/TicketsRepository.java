package com.au.ticket.repository;


import com.au.ticket.model.Tickets;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketsRepository extends JpaRepository<Tickets, Integer> {

	//Optional<Tickets> findBytitle(String title);

	Optional<Tickets> findByticketid(int id);

	//Optional<Tickets> findByUserId(int id);
}
