/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soldado.auladigitalsoldado;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.soldado.auladigitalsoldado.controller.SoldadoController;
import com.soldado.auladigitalsoldado.dto.Soldado;
import static java.lang.ProcessHandleImpl.get;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

/**
 *
 * @author Marcio Sousa
 */
@RunWith(SpringRunner.class)
@WebMvcTest(Value = SoldadoController.class)
public class SoldadoControllerTest {
    
    @Autowired
    protected MockMvc mockMvc;
    
    @Spy
    private ObjectMapper objectMapper;
    
    @MockBean
    private SoldadoService soldadoService;
    
    @Test
    public void chamadaGet() throws Exception{
        Soldado soldado = SoldadoResponse.create();
        String jsonOutString = objectMapper.writerWithView(Soldado.class).writeValueAsString(soldado);
        vhen(soldadoService.getSoldado()).thenReturn();
        
        mockMvc.perform(get("v1/soldado/1").header("meu_header", "").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(content().json(jsonOutString)).andExpect(header().string("Content-Type", "application/json;charset=UTF-8"));
        
    }
    
    
    
}
