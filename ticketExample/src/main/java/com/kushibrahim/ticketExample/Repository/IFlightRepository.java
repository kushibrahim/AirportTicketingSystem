package com.kushibrahim.ticketExample.Repository;

import com.kushibrahim.ticketExample.Entities.Flight;

import java.util.List;

public interface IFlightRepository {

    List<Flight> getAll();
    void add(Flight flight);
    Flight findByViewID(int id);
}
