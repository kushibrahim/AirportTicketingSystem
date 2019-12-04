package com.kushibrahim.ticketExample.Service;

import com.kushibrahim.ticketExample.Entities.Airport;

import java.util.List;

public interface IAirportService {

    List<Airport> getAll();
    void add(Airport airport);
    Airport findByViewID(int id);
}
