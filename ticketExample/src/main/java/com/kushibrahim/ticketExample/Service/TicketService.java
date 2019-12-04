package com.kushibrahim.ticketExample.Service;


import com.kushibrahim.ticketExample.Entities.Ticket;
import com.kushibrahim.ticketExample.Repository.ITicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketService implements ITicketService {

    private ITicketRepository ticketRepository;

    @Autowired
    public TicketService(ITicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    @Transactional
    public List<Ticket> getAll() {
        return ticketRepository.getAll();
    }

    @Override
    @Transactional
    public void add(Ticket ticket) {
        ticketRepository.add(ticket);
        ticket.setTicketSold(ticket.getTicketSold()+1);
    }

    @Override
    @Transactional
    public void delete(Ticket ticket) {
        ticketRepository.delete(ticket);
        ticket.setTicketSold(ticket.getTicketSold()-1);
    }

    @Override
    public Ticket findByViewTicket(String ticketNumber) {
        return ticketRepository.findByViewTicket(ticketNumber);
    }
}
