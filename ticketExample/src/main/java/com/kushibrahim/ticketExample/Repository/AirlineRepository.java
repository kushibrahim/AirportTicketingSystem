package com.kushibrahim.ticketExample.Repository;

import com.kushibrahim.ticketExample.Entities.Airline;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AirlineRepository implements IAirlineRepository {

    private EntityManager entityManager;

    @Autowired
    public AirlineRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Airline> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Airline> airlines = session.createQuery("from Airline", Airline.class).getResultList();
        return airlines;
    }

    @Override
    public void add(Airline airline) {
        Session session = entityManager.unwrap(Session.class);
        session.save(airline);
    }

    @Override
    public Airline findByViewID(int id) {
        Session session = entityManager.unwrap(Session.class);
        Airline airline = session.get(Airline.class,id);
        return airline;
    }
}
