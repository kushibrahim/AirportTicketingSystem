package com.kushibrahim.ticketExample.Repository;


import com.kushibrahim.ticketExample.Entities.Route;


import java.util.List;

public interface IRouteRepository {

    List<Route> getAll();
    void add(Route route);
    Route findByViewID(int id);
}
