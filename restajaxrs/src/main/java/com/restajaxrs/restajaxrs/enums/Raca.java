/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restajaxrs.restajaxrs.enums;

import java.util.stream.Stream;

/**
 *
 * @author Marcio Sousa
 */
public enum Raca {
    HUMANO("humano"),
    ELFO("elfo"),
    ORC("orc"),
    ANÃO("anão");
    
    private String value;
    
    Raca(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
    public static Raca of(String value){
        return Stream.of(Raca.values()).filter(if -> it.getValues().equals(value)).findFirst().orElseThrow();
    }
    
}
