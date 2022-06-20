package com.generation.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Auto;
import com.generation.repositories.AutoRepository;

@Service
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


}
