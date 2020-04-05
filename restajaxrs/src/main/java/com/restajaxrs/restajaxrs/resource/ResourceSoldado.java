/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restajaxrs.restajaxrs.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restajaxrs.restajaxrs.controller.SoldadoController;
import com.restajaxrs.restajaxrs.controller.response.SoldadoListResponse;
import com.restajaxrs.restajaxrs.controller.response.SoldadoResponse;
import com.restajaxrs.restajaxrs.entity.SoldadoEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author Marcio Sousa
 */
@Component
public class ResourceSoldado {
    private ObjectMapper objectMapper;
    
    public SoldadoListResponse criarLink(SoldadoEntity soldadoEntity){
        SoldadoListResponse soldadoListResponse = objectMapper.convertValue(soldadoEntity, SoldadoListResponse.class);
        Link link = linkTo(methodOn(SoldadoController.class).buscarSoldado(soldadoEntity.getId())).withSelfRel();
        soldadoListResponse.add();
        return soldadoListResponse;
    }
    
    public SoldadoResponse criarLinkDetalhe(SoldadoEntity soldadoEntity){
        SoldadoResponse soldadoResponse = objectMapper.convertValue(soldadoEntity, SoldadoListResponse.class);
        
        if(soldadoEntity.getStatus().equals("morto")){
            Link link = linkTo(methodOn(SoldadoController.class).deletarSoldado(soldadoEntity.getId())).vithRel("remover").withTitle("Deletar Soldado")withType("delete");
            soldadoResponse.add(link);
        }else if(soldadoEntity.getStatus().equals("vivo")){
            Link link = linkTo(methodOn(SoldadoController.class).frenteCastelo(soldadoEntity.getId())).vithRel("batalhar").withTitle("Ir para frente do castelo.")withType("put");
            soldadoResponse.add(link);
        }
        
        return soldadoResponse;
    }
}
