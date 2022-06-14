package com.generation.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/var") // localhost:8080var -> path por default
public class PathVariableRestController {
    //Capturar variables desde la ruta o path

    // localhost:8080/var/anio/2022/mes/6/dia/23
    @RequestMapping("/anio/{a}/mes/{m}/dia/{d}")
    public String capturarVariablesPath (@PathVariable("a") String anio, 
    @PathVariable("m") String mes, @PathVariable("d") String dia){

        return "La fecha es: "+anio+"/"+mes+"/"+dia;
    }

    //localhost:8080/var/fecha/2023/6/13
    //localhost:8080/var/fecha/{anio}/{mes}/{dia}

    @RequestMapping("/fecha/{anio}/{mes}/{dia}")
    public String ejercicio (@PathVariable("anio") String anio, 
    @PathVariable("mes") String mes, @PathVariable("dia") String dia){

        return "La fecha es: "+anio+"/"+mes+"/"+dia;
    }
}
