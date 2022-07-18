package com.generation.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.generation.services.AutoService;
import com.generation.models.Auto;

@RestController // Lo establecemos como controlador
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST }) // INVESTIGAR permite acceder desde otra direccion
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
