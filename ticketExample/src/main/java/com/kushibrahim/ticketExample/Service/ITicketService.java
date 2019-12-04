package com.kushibrahim.ticketExample.Service;

import com.kushibrahim.ticketExample.Entities.Ticket;

import java.util.List;

public interface ITicketService {

    List<Ticket> getAll();
    void add(Ticket ticket);
    void delete(Ticket ticket);

    Ticket findByViewTicket(String ticketNumber);
}
