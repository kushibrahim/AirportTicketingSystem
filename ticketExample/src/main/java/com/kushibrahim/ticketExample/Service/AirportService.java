package com.kushibrahim.ticketExample.Service;

import com.kushibrahim.ticketExample.Entities.Airport;
import com.kushibrahim.ticketExample.Repository.IAirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AirportService implements IAirportService {

    private IAirportRepository airportRepository;

    @Autowired
    public AirportService(IAirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    @Transactional
    public List<Airport> getAll() {
        return airportRepository.getAll();
    }

    @Override
    @Transactional
    public void add(Airport airport) {
        airportRepository.add(airport);
    }

    @Override
    @Transactional
    public Airport findByViewID(int id) {
        return airportRepository.findByViewID(id);
    }

}
