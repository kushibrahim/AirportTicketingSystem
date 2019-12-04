package com.kushibrahim.ticketExample.restAPI;

import com.kushibrahim.ticketExample.Entities.Flight;
import com.kushibrahim.ticketExample.Service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private IFlightService flightService;

    @Autowired
    public FlightController(IFlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public List<Flight> getAll() {
        return flightService.getAll();
    }

    @PostMapping("/addFlight")
    public void add(@RequestBody Flight flight) {
        flightService.add(flight);
    }

    @GetMapping("/searchFlight/{id}")
    public Flight findByViewID(@PathVariable int id) {
        return flightService.findByViewID(id);
    }

}
