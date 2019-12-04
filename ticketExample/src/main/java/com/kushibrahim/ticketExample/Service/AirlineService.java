package com.kushibrahim.ticketExample.Service;

import com.kushibrahim.ticketExample.Entities.Airline;
import com.kushibrahim.ticketExample.Repository.IAirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AirlineService implements IAirlineService {

    private IAirlineRepository airlineRepository;

    @Autowired
    public AirlineService(IAirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }

    @Override
    @Transactional
    public List<Airline> getAll() {
        return airlineRepository.getAll();
    }

    @Override
    @Transactional
    public void add(Airline airline) {
        airlineRepository.add(airline);
    }

    @Override
    @Transactional
    public Airline findByViewID(int id) {
        return airlineRepository.findByViewID(id);
    }
}
