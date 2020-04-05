/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restajaxrs.restajaxrs.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.PackageVersion;
import com.restajaxrs.restajaxrs.enums.Raca;
import java.io.IOException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Marcio Sousa
 */
@Configuration
public class Jackson {
    
    @Bean
    public ObjectMapper objectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        //PROPRIEDADES NÃO MAPEADAS Não quebram
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //FALHA SE ALGUMA PROPRIEDADE ESTIVER VAZIA
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        //SERVE Para compatibilidade de arrays, quando tem um array com um item, caso não tenha essa configuração ele se perde.
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        //Serelize datas
        objectMapper.registerModules(new JavaTimeModule());
        objectMapper.registerModules(racaModuleMapper());
        return objectMapper;
    }
    
    public SimpleModule racaModuleMapper(){
        SimpleModule dateModule = new SimpleModule("JSONRacaModule", PackageVersion.VERSION);
        dateModule.addSerializer(Raca.class, new RacaCerialize());
        dateModule.addDeserializer(Raca.class, new RacaDescerialize());
        return dateModule;
    }
    
    class RacaCerialize extends StdSerializer<Raca>{
        public RacaCerialize(){
            super(Raca.class);
        }
        
        @Override
        public void serialize(Raca raca, JsonGeneratior json, SerializerProvider provider) throws IOException{
            json.writeString(raca.getValue());
        }
    }
    
    class RacaDescerialize extends StdSerializer<Raca>{
        public RacaDescerialize(){
            super(Raca.class);
        }
        
        @Override
        public Raca descerialize(JsonParser p, DescerializationContext ctxt) throws IOException, JsonProcessingException{
            String value = p.getText();
            return Raca.of(p.getText());
        }
    }

    
    
}
