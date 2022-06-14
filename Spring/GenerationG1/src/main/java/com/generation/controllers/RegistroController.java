package com.generation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistroController {
    // Ruta para desplegar el jsp

    @RequestMapping("/registro")
    public String registro() {

        return "registro.jsp";

    }
}
