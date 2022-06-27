package com.generation.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.services.AutoService;
import com.generation.models.Auto;

@RestController // Lo establecemos como controlador
@RequestMapping("/api")
public class ApiRestController {
    @Autowired // Inyeccion de dependencia (traemos una clase para ser usada internamente)
    AutoService autoService;

    @RequestMapping("/obtener/autos")
    public List<Auto> obtenerListaAutos() {
        List<Auto> listaAutos = autoService.findAll();
        return listaAutos;
    }

    // API (JSON) JavaScript Notacion

}
