package com.kushibrahim.ticketExample.Service;

import com.kushibrahim.ticketExample.Entities.Flight;
import com.kushibrahim.ticketExample.Repository.IFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FlightService implements IFlightService {

    private IFlightRepository flightRepository;

    @Autowired
    public FlightService(IFlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    @Transactional
    public List<Flight> getAll() {
        return flightRepository.getAll();
    }

    @Override
    @Transactional
    public void add(Flight flight) {
        flightRepository.add(flight);
    }

    @Override
    @Transactional
    public Flight findByViewID(int id) {
        return flightRepository.findByViewID(id);
    }

}
