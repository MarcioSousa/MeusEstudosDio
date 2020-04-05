/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restajaxrs.restajaxrs.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restajaxrs.restajaxrs.controller.request.SoldadoEditRequest;
import com.restajaxrs.restajaxrs.controller.response.SoldadoListResponse;
import com.restajaxrs.restajaxrs.controller.response.SoldadoResponse;
import com.restajaxrs.restajaxrs.dto.Soldado;
import com.restajaxrs.restajaxrs.service.SoldadoService;
import javax.annotation.Resources;
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
    
    private SoldadoService soldadoService;
    private ObjectMapper objectMapper;
    
    public SoldadoController(SoldadoService soldadoService, ObjectMapper objectMapper){
        this.soldadoService = soldadoService;
        this.objectMapper = objectMapper;
    }
    
    @GetMapping("/{id]")
    public ResponseEntity<SoldadoResponse> buscarSoldado(@PathVariable() Long id){
        SoldadoResponse soldadoResponse = soldadoService.buscarSoldado(id);
        return ResponseEntity.status(HttpStatus.OK).body(soldadoResponse);
    }
    
    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody Soldado soldado){
        soldadoService.criarSoldado(soldado);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity editarSoldado(@PathVariable() Long id, @RequestBody SoldadoEditRequest soldadoEditRequest){
        soldadoService.alterarSoldado(id, soldadoEditRequest);
        return ResponseEntity.ok().build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity deletarSoldado(@PathVariable() Long id){
        soldadoService.deletarSoldado(id);
        return ResponseEntity.ok().build();
    }
    
    @PutMapping("/frente-castelo/{id}")
    public ResponseEntity frenteCastelo(@PathVariable() Long id){
        //FAZER ALGO
        return ResponseEntity.ok().build();
    }
    
    @GetMapping
    public ResponseEntity<Resources<SoldadoListResponse>> buscarSoldado(){
        Resources<SoldadoListResponse> soldadoListResponses = soldadoService.buscarSoldado();
        return ResponseEntity.status(HttpStatus.OK).body(soldadoListResponses);
    }
    
}
