/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globallabs.springwebmvc.service;

import br.com.globallabs.springwebmvc.exception.JediNotFoundException;
import br.com.globallabs.springwebmvc.model.Jedi;
import br.com.globallabs.springwebmvc.repository.JediRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcio Sousa
 */
@Service
public class JediService {

    @Autowired
    private JediRepository repository;
        
    public List<Jedi> findAll() {
        return repository.findAll();
    }

    public Jedi findById(final Long id) {
       final Optional<Jedi> jedi = repository.findById(id);
        
        if(jedi.isPresent()){
            return jedi.get();
        }else{
            throw  new JediNotFoundException();
        }
    }

    public Jedi save(final Jedi jedi) {
        return repository.save(jedi);
    }

    public Jedi update(final Long id,final Jedi dto) {
        final Optional<Jedi> jediEntity = repository.findById(id);
        final Jedi jedi;
        
        if(jediEntity.isPresent()){
            jedi = jediEntity.get();
        }else{
            throw new JediNotFoundException();
        }
        
        jedi.setName(dto.getName());
        jedi.setLastname(dto.getLastname());
        
        return repository.save(jedi);
    }

    public void delete(Long id) {
        final Jedi jedi = findById(id);
        
        repository.delete(jedi);
    }
    
}
