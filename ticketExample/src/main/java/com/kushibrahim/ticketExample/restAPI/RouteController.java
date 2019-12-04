package com.kushibrahim.ticketExample.restAPI;

import com.kushibrahim.ticketExample.Entities.Route;
import com.kushibrahim.ticketExample.Service.IRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class RouteController {

    private IRouteService routeService;

    @Autowired
    public RouteController(IRouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping
    public List<Route> getAll() {
        return routeService.getAll();
    }

    @PostMapping("/addRoute")
    public void add(@RequestBody Route route) {
        routeService.add(route);
    }

    @GetMapping("/searchRoute/{id}")
    public Route findByViewID(@PathVariable int id) {
        return routeService.findByViewID(id);
    }
}
