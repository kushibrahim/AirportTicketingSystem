package com.kushibrahim.ticketExample.Repository;

import com.kushibrahim.ticketExample.Entities.Ticket;

import java.util.List;

public interface ITicketRepository {

    List<Ticket> getAll();
    void add(Ticket ticket);
    void delete(Ticket ticket);

    Ticket findByViewTicket(String ticketNumber);
}
