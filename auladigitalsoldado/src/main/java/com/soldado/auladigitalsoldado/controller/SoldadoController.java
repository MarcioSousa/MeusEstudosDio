/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soldado.auladigitalsoldado.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.soldado.auladigitalsoldado.dto.Soldado;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marcio Sousa
 */
@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {
    private ObjectMapper objectMapper;
    
    @Value("${meuvalor}")
    private String meuValor;
    
    public SoldadoController(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }
    
    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody Soldado soldado){
        System.out.println("Entrou no post");
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity editarSoldado(@RequestBody Soldado soldado){
        System.out.println("Entrou no put");
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/{id]")
    public ResponseEntity<Soldado> buscarSoldado(@PathVariable() Long id){
        String testeProperties = meuValor;
        return ResponseEntity.ok(soldadoMock());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Soldado> deletar(@PathVariable() Long id){
        return ResponseEntity.ok().build();
    }
    
    @PutMapping("/frente-castelo/{id}")
    public ResponseEntity frenteCastelo(@PathVariable() Long id){
        //FAZER ALGO
        return ResponseEntity.ok().build();
    }
    
    
    private Soldado soldadoMock(){
        Soldado soldado = new Soldado();
        soldado.setArma("Espada");
        soldado.setIdade(24);
        soldado.setNome("");
        soldado.setRaca("humano");
        soldado.setStatus("vivo");
        return soldado;
    }
    
    //@GetMapping
    //public ResponseEntity<Resources<SoldadoListResponse>> buscarSoldado(){
    //    Resources<SoldadoListResponse> soldadoListResponses = soldadoService.buscarSoldado();
    //    return ResponseEntity.status(HttpStatus.OK).body(soldadoListResponses);
    //}
    
}
