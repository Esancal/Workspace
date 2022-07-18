package com.generation.services;

import java.util.List;

import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
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

    public boolean saveUsuario(@Valid Usuario usuario) {
        // validaciones de nisercion (crear o registrar usuario)
        // 1.- Validar si email existe en la BBDD
        Usuario existeUsuario = usuarioRepository.findByEmail(usuario.getEmail());

        // Si no existe el usuario, lo creamos
        if (existeUsuario == null) {

            // 2.- Encriptar el password
            String passEncriptado = BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt());
            usuario.setPassword(passEncriptado);
            usuarioRepository.save(usuario);
            return false;
        }
        // Si existe, retornamos un boolean true
        else {
            return true;
        }
    }

    public boolean validarUsuario(String email, String password) {
        // verificar el email
        Usuario existeUsuario = usuarioRepository.findByEmail(email);

        if(existeUsuario == null){
            return true;
        }
        // Comprobar si la password desencriptada existe
        else if(BCrypt.checkpw(password, existeUsuario.getPassword())){
            // Passwords iguales
            return false;
        }
        else{
            return true;
        }
    }

    public List<Usuario> findAll() {
        // obtener y retornar la lista de usuarios
        return usuarioRepository.findAll();
    }
}