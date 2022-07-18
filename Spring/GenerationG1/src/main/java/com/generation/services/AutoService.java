package com.generation.services;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.generation.models.Auto;
import com.generation.repositories.AutoRepository;

@Service
@Transactional
public class AutoService {

    // llamar al Reporistory (Induccion de dependencia)

    @Autowired
    AutoRepository autoRepository;

    //Guardar un auto
    public void saveAuto(@Valid Auto auto) {
        autoRepository.save(auto);
    }

    // Obtener una lista de autos
    public List<Auto> findAll() {
        return autoRepository.findAll();
    }

    public Auto buscarId(Long id) {
        return autoRepository.findById(id).get(); //.get especifica el tipo de dato que necesitamos
    }

    public void eliminarPorId(Long id) {
        autoRepository.deleteById(id);
    }

    public List<Auto> buscarMarca(String marca) {
        //Llamado de un metodo propio
        //return autoRepository.buscarMarca(marca); //Query tradicional
        return autoRepository.findAllAutoMarca(marca);
    }

    public List<Auto> buscarColor(String color) {
        return autoRepository.buscarColor(color);
    }

    //Paginacion
    //Variable estatica, cantidad de datos a mostrar por pagina
    //(para la estaticas usar mayuscula como buena practica)
    private static final int LOTE = 5;

    public Page<Auto> paginarAutos(int numeroPagina){
        PageRequest pageRequest = PageRequest.of(numeroPagina, LOTE,Sort.Direction.ASC,"marca");
		// Page<Auto> autos = autoRepository.findAll(pageRequest); // Se puede añadir autos en el return
		return autoRepository.findAll(pageRequest);
    }
}
