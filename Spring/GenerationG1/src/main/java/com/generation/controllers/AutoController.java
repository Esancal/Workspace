package com.generation.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Auto;
import com.generation.services.AutoService;

@Controller
@RequestMapping("/auto")
public class AutoController {// http://localhost:8080/auto

    // Inyeccion de depedencias
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

            return "redirect:/auto/mostrar";
        }

    }

    @RequestMapping("/mostrar")
    public String mostrar(Model model){
        // Obtener una lista de autos
        List<Auto> listaAutos = autoService.findAll();
        model.addAttribute("listaAutos", listaAutos); // Pasamos la lista al jsp        
        return "mostrarAutos.jsp"; // La pagina que desplegamos

    }

    //localhost:8080/auto/editar/{id}
    @RequestMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model){
        /* Edicion:
		capturar el id
		buscar el objeto completo a bd
		pasar el objeto completo al JSP
		mostrar los datos en el JSP
		modicar un dato, menos el ID
		pasar el objeto modificado al controlador
		en la nueva ruta(controlador), capturamos el objeto
		actualizar el objeto en base datos */

        System.out.println("El id es "+ id);
        Auto auto = autoService.buscarId(id);
        model.addAttribute("auto", auto); //pasar al jsp


        return "editarAuto.jsp";
    }
    //localhost:8080/auto/actualizar/{id}
    @PostMapping("/actualizar/{id}")
    public String actualizarAuto(@PathVariable("id") Long id, @Valid @ModelAttribute("auto") Auto auto,
            BindingResult resultado, Model model) {
        // El bindingResult va seguido del Valid, este valida lo que esta en el jsp
        if (resultado.hasErrors() || auto.getModelo() == "" || auto.getColor() == "" || auto.getMarca() == "") { // Capturando si existe un error en el
            model.addAttribute("msgError", "Datos mal ingresados"); // ingreso de datos desde el jsp
            return "auto.jsp";
        } else {
            auto.setId(id);
            // Enviar el objeto al servicio
            autoService.saveAuto(auto);

            return "redirect:/auto/mostrar";
        }
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarAuto(@PathVariable("id") Long id){

        autoService.eliminarPorId(id);
        return "redirect:/auto/mostrar";
    }

}