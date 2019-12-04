package com.kushibrahim.ticketExample.Repository;

import com.kushibrahim.ticketExample.Entities.Flight;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class FlightRepository implements IFlightRepository {

    private EntityManager entityManager;

    @Autowired
    public FlightRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Flight> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Flight> flights = session.createQuery("from Flight", Flight.class).getResultList();
        return flights;
    }

    @Override
    public void add(Flight flight) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(flight);
    }

    @Override
    public Flight findByViewID(int id) {
        Session session = entityManager.unwrap(Session.class);
        Flight flight = session.get(Flight.class,id);
        return flight;
    }
}
