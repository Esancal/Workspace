package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2") //Mapping = Rutas // param = Parametros
public class ParametrosRestController{

    //localhost:8080/api?fecha=20220613
    @RequestMapping()
    public String fecha(@RequestParam(value="fecha") String fecha){

        return "La fecha es: "+ fecha;
    }
    
    //localhost:8080/api/seccion?modulo=3&seccion=5
    //Deben estar los 2 parametros, no importa el orden
    @RequestMapping("/seccion")
    public String seccion(@RequestParam(value="modulo") String modulo,
    @RequestParam(value="seccion") String seccion){

        return "El modulo es: "+ modulo + " La seccion es: " + seccion;
    }

    //Rutas con parametros no obligatorios

    //localhost:8080/api/date?anio=2000&mes=4&dia=25
    @RequestMapping("/date")
    public String capturarParametro(
        @RequestParam(value="anio", required = false) String anio,
        @RequestParam(value="mes", required = false) String mes,
        @RequestParam(value="dia", required = false) String dia
        ){
        if(anio!= null){
            System.out.println("Año = " + anio);
        }
        if(mes!= null){
            System.out.println("Año = " + mes);
        }
        if(dia!= null){
            System.out.println("Año = " + dia);
        }
        
            return dia + " del mes " + mes + " del año "+ anio;
    }

}