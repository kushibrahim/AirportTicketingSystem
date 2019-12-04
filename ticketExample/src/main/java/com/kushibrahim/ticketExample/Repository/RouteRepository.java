package com.kushibrahim.ticketExample.Repository;

import com.kushibrahim.ticketExample.Entities.Route;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RouteRepository implements IRouteRepository {

    private EntityManager entityManager;

    @Autowired
    public RouteRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Route> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Route> routes = session.createQuery("from Route", Route.class).getResultList();
        return routes;
    }

    @Override
    public void add(Route route) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(route);
    }

    @Override
    public Route findByViewID(int id) {
        Session session = entityManager.unwrap(Session.class);
        Route routes = session.get(Route.class,id);
        return routes;
    }
}
