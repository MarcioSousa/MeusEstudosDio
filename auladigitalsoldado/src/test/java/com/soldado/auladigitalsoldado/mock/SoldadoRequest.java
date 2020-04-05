/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soldado.auladigitalsoldado.mock;

import com.soldado.auladigitalsoldado.dto.Soldado;

/**
 *
 * @author Marcio Sousa
 */
public class SoldadoRequest {
       public static Soldado create(){
        Soldado soldado = new Soldado();
        soldado.setArma("Espada");
        soldado.setIdade(24);
        soldado.setNome("João");
        soldado.setRaca("humano");
        soldado.setStatus("vivo");
        return soldado;
    }
}
