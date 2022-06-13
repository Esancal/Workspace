package com.generation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Esto establece que es un controlador
public class IndexController {
    
    //http://localhost:8080/

    @RequestMapping("/") // Anotacion para capturar las rutas
    public String index(){
        return "Jelou eberiwan";
    }

    //http://localhost:8080/
    //@RequestMapping("/usuario")
}
