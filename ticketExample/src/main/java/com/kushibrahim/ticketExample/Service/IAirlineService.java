package com.kushibrahim.ticketExample.Service;

import com.kushibrahim.ticketExample.Entities.Airline;

import java.util.List;

public interface IAirlineService {

    List<Airline> getAll();
    void add(Airline airline);
    Airline findByViewID(int id);
}
