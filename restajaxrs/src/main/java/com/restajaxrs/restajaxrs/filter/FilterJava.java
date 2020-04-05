/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restajaxrs.restajaxrs.filter;

import java.lang.System.Logger;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

/**
 *
 * @author Marcio Sousa
 */
@Component
public class FilterJava implements Filter{

    private Logger logger = LoggerFactory.getLogger(FilterJava.class);
    
    @Override
    public boolean isLoggable(LogRecord record) {
        logger.info("Chegou no portão do castelo");
        HttpServletRequest req = (HttpServletRequest) request;
        Enumeration<String> headerNames = req.getHeaderNames();
        Map<String, String> mapHeders = Collections.list(headerNames).stream().collect(Collectors.toMap(it -> it, req:: getHeader));
        
        if(mapHeders.get("autorization") != null && mapHeders.get("authorization").equals("BATATINHA")){
            chain.doFilter(request,response);
        }else{
            HttpServletResponse res = (HttpServletResponse) response;
            res.sendError(403);
        }

        logger.info("Saiu do portão do castelo");
        
    }
    
    
    
}
