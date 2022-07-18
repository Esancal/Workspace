package com.generation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{ // JpaRepository<Objeto, Tipo_dato_FK>
    /* Las interfaces solo definen los metodos 
     * Querys y usar metodos que se conectan a la base de datos
    */
    /* Validar la existencia del Email */

    Usuario findByEmail(String email);
}
