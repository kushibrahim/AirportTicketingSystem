package com.kushibrahim.ticketExample.Service;

import com.kushibrahim.ticketExample.Entities.Route;

import java.util.List;

public interface IRouteService {

    List<Route> getAll();
    void add(Route route);
    Route findByViewID(int id);
}
