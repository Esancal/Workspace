package com.generation.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Usuario;
import com.generation.repositories.UsuarioRepository;

// Logica de negocio, o validaciones del sistema

@Service
public class UsuarioService {
    // llamar al Reporistory (Induccion de dependencia)

    @Autowired
    UsuarioRepository usuarioRepository;

    public void saveUsuario(@Valid Usuario usuario) {
        usuarioRepository.save(usuario);
    }

}
