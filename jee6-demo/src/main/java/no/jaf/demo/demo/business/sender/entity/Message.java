/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.jaf.demo.demo.business.sender.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Jon
 */
@Entity
public class Message {
    
    @Id
    @GeneratedValue
    private long id;
    
    private String message;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
