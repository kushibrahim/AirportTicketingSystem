package com.kushibrahim.ticketExample.Repository;

import com.kushibrahim.ticketExample.Entities.Ticket;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class TicketRepository implements ITicketRepository {

    private EntityManager entityManager;

    @Autowired
    public TicketRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Ticket> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Ticket> tickets = session.createQuery("from Ticket",Ticket.class).getResultList();
        return tickets;
    }

    @Override
    public void add(Ticket ticket) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(ticket);
    }

    @Override
    public void delete(Ticket ticket) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(ticket);
    }

    @Override
    public Ticket findByViewTicket(String ticketNumber) {
        Ticket ticket = null;
        Query query = entityManager.createQuery("SELECT u FROM Ticket u WHERE u.ticketNumber=:ticketNumber");
        query.setParameter("ticketNumber", ticketNumber);
        try {
            ticket = (Ticket) query.getSingleResult();
        } catch (Exception e) {
            // Handle exception
        }
        return ticket;
    }
}
