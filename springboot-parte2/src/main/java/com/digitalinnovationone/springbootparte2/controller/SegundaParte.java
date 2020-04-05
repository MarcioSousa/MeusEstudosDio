package com.digitalinnovationone.springbootparte2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SegundaParte {
    @GetMapping("/")
    public String helloMessage(){
        return "Hello Teste 2, Digital Innovation One!";
    }
}
