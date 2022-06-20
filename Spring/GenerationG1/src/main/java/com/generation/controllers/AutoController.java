package com.generation.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Auto;
import com.generation.services.AutoService;

@Controller
@RequestMapping("/auto")
public class AutoController {// http://localhost:8080/auto

    // Imyeccion de depedencias
    @Autowired
    AutoService autoService;

    @RequestMapping("")
    public String autoRegistro(@ModelAttribute("auto") Auto auto) {
        return "auto.jsp"; // La pagina que desplegamos
    }

    @PostMapping("/registro")
    public String saveAuto(@Valid @ModelAttribute("auto") Auto auto,
            BindingResult resultado, Model model) {
        // El bindingResult va seguido del Valid, este valida lo que esta en el jsp
        if (resultado.hasErrors() || auto.getModelo() == "" || auto.getColor() == "" || auto.getMarca() == "") { // Capturando si existe un error en el
            model.addAttribute("msgError", "Datos mal ingresados"); // ingreso de datos desde el jsp
            return "auto.jsp";
        } else {
            // Enviar el objeto al servicio
            autoService.saveAuto(auto);

            // Obtener una lista de autos
            List<Auto> listaAutos = autoService.findAll();
            model.addAttribute("listaAutos", listaAutos); // Pasamos la lista al jsp
            return "mostrarAutos.jsp"; // La pagina que desplegamos
        }

    }
}