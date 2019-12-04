package com.kushibrahim.ticketExample.restAPI;

import com.kushibrahim.ticketExample.Entities.Airport;
import com.kushibrahim.ticketExample.Service.IAirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airports")
public class AirportController {

    private IAirportService airportService;

    @Autowired
    public AirportController(IAirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping
    public List<Airport> getAll() {
        return airportService.getAll();
    }

    @PostMapping("/addAirport")
    public void add(@RequestBody Airport airport) {
        airportService.add(airport);
    }

    @GetMapping("/searchAirports/{id}")
    public Airport findByViewID(@PathVariable int id) {
        return airportService.findByViewID(id);
    }
}
