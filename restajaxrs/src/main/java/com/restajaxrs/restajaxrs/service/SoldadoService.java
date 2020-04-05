/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restajaxrs.restajaxrs.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restajaxrs.restajaxrs.controller.request.SoldadoEditRequest;
import com.restajaxrs.restajaxrs.controller.response.SoldadoListResponse;
import com.restajaxrs.restajaxrs.controller.response.SoldadoResponse;
import com.restajaxrs.restajaxrs.dto.Soldado;
import com.restajaxrs.restajaxrs.entity.SoldadoEntity;
import com.restajaxrs.restajaxrs.repository.SoldadoRepository;
import com.restajaxrs.restajaxrs.resource.ResourceSoldado;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Resources;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcio Sousa
 */
@Service
public class SoldadoService {
    
    private SoldadoRepository soldadoRepository;
    private ObjectMapper objectMapper;
    private ResourceSoldado resourceSoldado;
    
    public SoldadoService(SoldadoRepository soldadoRepository, ObjectMapper objectMapper, ResourceSoldado resourceSoldado){
        this.soldadoRepository = soldadoRepository;
        this.objectMapper = objectMapper;
        this.resourceSoldado = resourceSoldado;
    }
    
    public SoldadoResponse buscarSoldado(Long id){
        //SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow();
        SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow();
        SoldadoResponse soldadoResponse = resourceSoldado.criarLinkDetalhe((soldado));
        return soldadoResponse;
    }
    
    public void criarSoldado(Soldado soldado){
        SoldadoEntity soldadoEntity = objectMapper.convertValue(soldado, SoldadoEntity.class);
        soldadoRepository.save(soldadoEntity);
    }
    
    public void alterarSoldado(Long id, SoldadoEditRequest soldadoEditRequest) {
        SoldadoEntity soldadoEntity = objectMapper.convertValue(soldadoEditRequest, SoldadoEntity.class);
        soldadoEntity.setId(id);
        soldadoRepository.save(soldadoEntity);
    }

    public void deletarSoldado(Long id) {
        //SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow();
        SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow();
        soldadoRepository.delete(soldado);
    }
    
    public Resources<SoldadoListResponse> buscarSoldado() {
        List<SoldadoEntity> all = soldadoRepository.findAll();
        
        List<SoldadoListResponse> soldadoStream = all.stream().map(it -> resourceSoldado.criarLink(it)).collect(Collectors.toList());
        return new Resources<>(soldadoStream);
    }
}
