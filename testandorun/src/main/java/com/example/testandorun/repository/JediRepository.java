/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globallabs.springwebmvc.repository;

import br.com.globallabs.springwebmvc.model.Jedi;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcio Sousa
 */
public class JediRepository {
    private List<Jedi> jedi;

    public JediRepository() {
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "Skywalker"));
    }
    
    public List<Jedi> getAllJedi(){
        return this.jedi;
    }
    
    public void add(final Jedi jedi){
        this.jedi.add(jedi);
    }
    
}
