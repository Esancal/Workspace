package com.generation.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Usuario;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    // Ruta para desplegar el jsp
    // http://localhost:8080/registro
    // Desde el controlador enviamos un objeto con atributos, pero vacio "usuario"
    // de tipo "Usuario"
    @RequestMapping("")
    public String registro(@ModelAttribute("usuario") Usuario usuario) {
        return "registro.jsp"; // La pagina que desplegamos
    }

    // Ruta para capturar los datos del formulario
    // http://localhost:8080/registro/usuario
    // PostMapping solo permite que se acceda despues de un formulario tipo post
    @PostMapping("/usuario/respaldo")
    public String registroUsuario(@RequestParam(value = "nombre") String nombre,
            @RequestParam(value = "apellido") String apellido,
            @RequestParam(value = "edad") String edad,
            @RequestParam(value = "password") String password) {
        System.out.println("Llegamos al metodo registroUsuario\nNombre: " + nombre + "\nApellido: " + apellido
                + "\nEdad: " + edad);
        return "registroUsuario.jsp";
    }

    // Y aqui capturamos el objeto con los atributos llenos
    @PostMapping("/usuario")
    public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, 
    BindingResult resultado, Model model) {
        //El bindingResult va seguido del Valid, este valida lo que esta en 
        if(resultado.hasErrors()){ //Capturando si existe un error en el ingreso de datos desde el jsp
            model.addAttribute("msgError", "Datos mal ingresados");
            return "registro.jsp";
        }
        System.out.println(usuario.getNombre()+ " " + usuario.getApellido()+ " " + usuario.getEdad()+ "" + usuario.getPassword());
        return "index.jsp"; // La pagina que desplegamos
    }

}
