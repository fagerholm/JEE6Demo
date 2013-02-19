package no.jaf.demo.demo.business.sender.boundary;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import no.jaf.demo.demo.business.logging.PerformanceLogger;
import no.jaf.demo.demo.business.sender.entity.Message;

@Stateless
@Interceptors(PerformanceLogger.class)
public class MessagingService {
    
    @PersistenceContext
    EntityManager em;
    
    public void send(String message){
        em.persist(new Message(message));
    }
    
}
