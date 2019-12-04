package com.kushibrahim.ticketExample.Service;

import com.kushibrahim.ticketExample.Entities.Flight;

import java.util.List;

public interface IFlightService {

    List<Flight> getAll();
    void add(Flight flight);
    Flight findByViewID(int id);
}
