package com.generation.api;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // Esto establece que es un controlador
public class EnrutamientoRestController {
    
    //http://localhost:8080/
    
    /* *ENRUTAMIENTO* */
    //http://localhost:8080/usuario
    @RequestMapping("/usuario") //Va sin ";"
    public String usuario(){
        return "Estamos en la URL usuario";
    }

    @RequestMapping("/usuario/inscrito") //Va sin ";"
    public String inscrito(){
        return "Estamos en la URL usuario/inscrito";
    }

    @RequestMapping("/cliente/registrado") //Va sin ";"
    public String cliente(){
        return "Ruta de cliente";
    }
    
    @RequestMapping(value= "/proveedor/registrado", method = RequestMethod.GET) //Va sin ";"
    public String proveedor(){
        return "Ruta de proveedor";
    }
}
