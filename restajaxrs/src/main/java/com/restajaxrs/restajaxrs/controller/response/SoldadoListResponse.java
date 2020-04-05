/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restajaxrs.restajaxrs.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Marcio Sousa
 */
public class SoldadoListResponse extends ResourceSupport{
    private Long id;
    private String nome;
    private String raca;

    @JsonProperty("id")
    public Long getResponseId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
    
    
    
}
