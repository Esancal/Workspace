package com.generation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Usuario;

@Controller // Esto establece que es un controlador
public class IndexController {

    // http://localhost:8080/

    @RequestMapping("/") // Anotacion para capturar las rutas
    public String index(Model model) {
        model.addAttribute("apellidos", "Castañeda Alfaro");
        model.addAttribute("nombres", "Esteban Andres");
        model.addAttribute("edad", 22);

        // Instancia de usuario
        Usuario usuario = new Usuario("Donato", "Loren", 12);

        model.addAttribute("usuario", usuario);

        return "index.jsp";
    }

}
