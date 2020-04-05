/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app.config;

/**
 *
 * @author Marcio Sousa
 */
@Configuration
public class Jackson {
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        //PROPIEDADES NÂO MAPEADAS Não quebram
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //FALHA SE ALGUMA PROPIEDADE ESTIVER VAZIA
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        // SERVE Para compatiblidade de arrays, quando tem um array com um item, caso não tenha essa config ele se perde
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        //Serelize datas
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper;
    }
}
