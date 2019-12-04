package com.kushibrahim.ticketExample.Repository;

import com.kushibrahim.ticketExample.Entities.Airport;

import java.util.List;

public interface IAirportRepository {

    List<Airport> getAll();
    void add(Airport airport);
    Airport findByViewID(int id);
}
