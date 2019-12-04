package com.kushibrahim.ticketExample.Repository;

import com.kushibrahim.ticketExample.Entities.Airline;

import java.util.List;

public interface IAirlineRepository {

    List<Airline> getAll();
    void add(Airline airline);
    Airline findByViewID(int id);
}
