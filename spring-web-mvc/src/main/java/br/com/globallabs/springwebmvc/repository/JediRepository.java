/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globallabs.springwebmvc.repository;

import br.com.globallabs.springwebmvc.model.Jedi;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcio Sousa
 */
@Repository
public interface JediRepository extends JpaRepository<Jedi, Long> {
    List<Jedi> findByNameContainingIgnoreCase(final String name); 

    public Jedi findById(Long id);
}
