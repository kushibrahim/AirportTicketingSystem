package com.kushibrahim.ticketExample.Service;


import com.kushibrahim.ticketExample.Entities.Route;
import com.kushibrahim.ticketExample.Repository.IRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RouteService implements IRouteService {

    private IRouteRepository routeRepository;

    @Autowired
    public RouteService(IRouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @Override
    @Transactional
    public List<Route> getAll() {
        return routeRepository.getAll();
    }

    @Override
    @Transactional
    public void add(Route route) {
        routeRepository.add(route);
    }

    @Override
    @Transactional
    public Route findByViewID(int id) {
        return routeRepository.findByViewID(id);
    }
}
