/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restajaxrs.restajaxrs.controller.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.ws.rs.core.Link;
import org.springframework.util.Assert;

/**
 *
 * @author Marcio Sousa
 */
public class Rascunho implements Identifiable<Link> {
    private final List<Link> links;

    //public ResourceSupport()...
    
    public Rascunho(){
        this.links = new ArrayList<Link>();
    }
    
    @JsonIgnore
    public Link getId(){
        return getLink(Link.REL_SELF);
    }
    
    
    public void add(Link link){
        assert.notNull(link, "Link must not be null!");
        this.links.add(link);
    }
    
    public void add(Iterable<Link> links){
        Assert.notNull(links, "Given links must not be null!");
        for(Link candidate : links){
            add(candidate);
        }
    }
    
    
    
    
}
