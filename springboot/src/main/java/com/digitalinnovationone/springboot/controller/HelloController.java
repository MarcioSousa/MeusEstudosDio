package com.digitalinnovationone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String helloMessage(){
        return "Hello, Digital Innovation One!";
    }
    
}

/*
|    +--- META-INF
|    |    \--- spring.factories
|    +--- org.springframework.boot.autoconfigure
(...)
|    |    + jbdc
|    |    |    \--- DataSourceAutoConfiguration
(...)
|    |    +--- web
|    |    |    +--- DispatcherServletAutoConfiguration
|    |    |    +--- EmbeddedServletContainerAutoConfiguration
|    |    |    \--- WebMvcAutoConfiguration
(...)
|    |    +--- orm.java
|    |    |    +--- HibernateJpaAutoConfiguration
|    |    |    \--- JpaBaseConfiguration
|    |    \--- EnableAutoConfiguration
*/
