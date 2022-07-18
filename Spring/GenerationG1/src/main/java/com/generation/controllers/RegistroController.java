package com.generation.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Usuario;
import com.generation.services.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegistroController {// http://localhost:8080/registro

    // Inyeccion de dependencias
    @Autowired
    UsuarioService usuarioService;

    // Ruta para desplegar el jsp
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
        // El bindingResult va seguido del Valid, este valida lo que esta en
        if (resultado.hasErrors()) { // Capturando si existe un error en el ingreso de datos desde el jsp
            model.addAttribute("msgError", "Datos mal ingresados");
            return "registro.jsp";
        }

        // Enviar el objeto al servicio
        boolean usuarioCreado = usuarioService.saveUsuario(usuario);

        if (usuarioCreado) {
            model.addAttribute("msgError", "El email ya esta registrado");
            return "registro.jsp";
        } else {
            return "login.jsp"; // La pagina que desplegamos
        }
    }

    @PostMapping("/usuario/ingreso")
    public String login(@Valid @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password, Model model) {
        // validaciones (?)
        // SIEMPRE VALIDAR SI EL PARAMETRO NO ES NULO O VACIO
        if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
            model.addAttribute("msgError", "Todos los campos son obligatorios");
            return "registro.jsp";
        }

        boolean usuarioValidado = usuarioService.validarUsuario(email, password);

        // Si es True indica que hay un error en el ingreso
        if(usuarioValidado){
            model.addAttribute("msgError", "Error en el ingreso");
            return "login.jsp";
        }// Si es False indica que no hay errores para ingresar
        else{
            return "home.jsp";
        }

        // service
        // Verificar si la password es la misma que la de la BBDD desencriptada
        // Si el correo existe en la bbdd
    }

    @RequestMapping("/usuario/login")
	public String login() {
		return "login.jsp";
	}

}
