/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globallabs.springwebmvc.model;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 *
 * @author Marcio Sousa
 */
@Entity
@Table(name = "jedi")
public class Jedi {

    @Id
    @Column(name="id_jedi")
    @GeneratedValue(strategy = GenerationType.Auto)
    private Long id;
    
    @Size(min = 3, max = 10, message = "Nome deve conter entre 3 e 10 caracteres")
    @NotBlank(message = "Nome não pode estar em branco")
    @Column(name = "name")
    private String name;
    
    @NotBlank(message = "Sobrenome não pode estar em branco")
    @Column(name = "name")
    private String lastname;

    public Jedi() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public Jedi(final String name, final String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    
    
}
