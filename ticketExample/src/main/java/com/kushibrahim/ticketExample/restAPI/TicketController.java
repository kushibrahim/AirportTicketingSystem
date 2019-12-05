package com.kushibrahim.ticketExample.restAPI;

import com.kushibrahim.ticketExample.Entities.Flight;
import com.kushibrahim.ticketExample.Entities.Ticket;
import com.kushibrahim.ticketExample.Service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private ITicketService ticketService;
    private Flight flight;

    @Autowired
    public TicketController(ITicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<Ticket> getAll() {
        return ticketService.getAll();
    }

    @PostMapping("/addTicket")
    public void add(@RequestBody Ticket ticket) {
        ticketService.add(ticket);
        int ticketSold = ticket.getTicketSold();
        int flightCapacity = flight.getFlightCapacity();
        if(flightCapacity*0.2>ticketSold){
            if (ticketSold>flightCapacity*0.1){
                ticket.setTicketPrice(ticket.getTicketPrice()*1.1);
            }
        }
        else if(flightCapacity*0.3>ticketSold){
            if(ticketSold>flightCapacity*0.2){
                ticket.setTicketPrice(ticket.getTicketPrice()*1.2);
            }
        }
        else if(flightCapacity*0.4>ticketSold){
            if(ticketSold>flightCapacity*0.3){
                ticket.setTicketPrice(ticket.getTicketPrice()*1.3);
            }
        }
        else if(flightCapacity*0.5>ticketSold){
            if(ticketSold>flightCapacity*0.4){
                ticket.setTicketPrice(ticket.getTicketPrice()*1.4);
            }
        }
        else if(flightCapacity*0.6>ticketSold){
            if(ticketSold>flightCapacity*0.5){
                ticket.setTicketPrice(ticket.getTicketPrice()*1.5);
            }
        }
        else if(flightCapacity*0.7>ticketSold){
            if(ticketSold>flightCapacity*0.6){
                ticket.setTicketPrice(ticket.getTicketPrice()*1.6);
            }
        }
        else if(flightCapacity*0.8>ticketSold){
            if(ticketSold>flightCapacity*0.7){
                ticket.setTicketPrice(ticket.getTicketPrice()*1.7);
            }
        }
        else if(flightCapacity*0.9>ticketSold){
            if(ticketSold>flightCapacity*0.8){
                ticket.setTicketPrice(ticket.getTicketPrice()*1.8);
            }
        }
        else if(flightCapacity>ticketSold){
            if(ticketSold>flightCapacity*0.9){
                ticket.setTicketPrice(ticket.getTicketPrice()*1.9);
            }
        }
    }

    @DeleteMapping("/deleteTicket/{id}")
    public void delete(@PathVariable int id) {
        ticketService.delete(id);
    }


    @GetMapping("/searchTicket/{ticketNumber}")
    public Ticket findByViewByTicket(@PathVariable String ticketNumber) {
        return ticketService.findByViewTicket(ticketNumber);
    }
}
