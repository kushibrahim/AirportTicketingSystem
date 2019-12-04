package com.kushibrahim.ticketExample.Repository;

import com.kushibrahim.ticketExample.Entities.Airport;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AirportRepository implements IAirportRepository {

    private EntityManager entityManager;

    @Autowired
    public AirportRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Airport> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Airport> airports = session.createQuery("from Airport", Airport.class).getResultList();
        return airports;
    }

    @Override
    public void add(Airport airport) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(airport);
    }

    @Override
    public Airport findByViewID(int id) {
        Session session = entityManager.unwrap(Session.class);
        Airport airport = session.get(Airport.class,id);
        return airport;
    }
}
