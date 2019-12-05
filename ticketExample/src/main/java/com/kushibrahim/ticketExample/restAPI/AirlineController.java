package com.kushibrahim.ticketExample.restAPI;

import com.kushibrahim.ticketExample.Entities.Airline;
import com.kushibrahim.ticketExample.Service.IAirlineService;
import com.kushibrahim.ticketExample.Service.IAirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airlines")
public class AirlineController {

    private IAirlineService airlineService;

    @Autowired
    public AirlineController(IAirlineService airlineService) {
        this.airlineService = airlineService;
    }

    @GetMapping
    public List<Airline> getAll() {
        return airlineService.getAll();
    }

    @PostMapping("/addAirline")
    public void add(Airline airline) {
        airlineService.add(airline);
    }

    @GetMapping("/searchAirline/{id}")
    public Airline findByViewID(@PathVariable int id) {
        return airlineService.findByViewID(id);
    }
}
