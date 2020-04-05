/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globallabs.springwebmvc.model;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Marcio Sousa
 */
public class Jedi {
    @NotBlank
    private String name;
    
    @NotBlank
    private String lastname;

    public Jedi() {
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
