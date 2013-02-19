/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.jaf.demo.demo.presentation;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import no.jaf.demo.demo.business.sender.boundary.MessagingService;

/**
 *
 * @author Jon
 */
@Model
public class Index {
    
    @Inject
    MessagingService ms;
    
    public String get(){
        ms.send("message");
        return "Done";
    }
    
}
