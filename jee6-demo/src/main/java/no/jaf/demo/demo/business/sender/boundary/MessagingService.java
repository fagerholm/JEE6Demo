package no.jaf.demo.demo.business.sender.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import no.jaf.demo.demo.business.PortScanner;
import no.jaf.demo.demo.business.logging.PerformanceLogger;
import no.jaf.demo.demo.business.sender.entity.Message;

@Stateless
@Interceptors(PerformanceLogger.class)
public class MessagingService {
    
    @PersistenceContext
    EntityManager em;
    
    @Inject
    PortScanner scanner;
    
    public void send(String message){
        em.persist(new Message(message));
        scanner.scan(1526, 1528);
    }
    
}
