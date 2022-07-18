package com.generation.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generation.models.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long> {
    // JPQL
    // (2 formas de hacer lo mismo)
    // Usamos el objeto para hacer la query
    @Query("Select a from Auto a where a.marca = ?1")
    List<Auto> findAllAutoMarca(String marca);
    //List<Auto> getAutoWhereMarca(String marca);

    // Query comun
    //value = "select * from autos a where a.marca = ?1 and a.modelo = ?2" el ?2 es para el segundo ingreso
    @Query(value = "select * from autos a where a.marca = ?1", nativeQuery = true)
    List<Auto> buscarMarca(String marca);

    @Query(value = "select * from autos a where a.color = ?1", nativeQuery = true)
    List<Auto> buscarColor(String color);

    //Filtro por algunas columnas de la tabla
    @Query(value="SELECT a.marca, a.color FROM autos a WHERE a.marca = ?1 and a.color=?2",nativeQuery = true)
	List<Object[]> buscarMarcaColor(String marca, String color);

    /*
    //Inner Join
    @Query(value = "Select a from Auto join a.CompraVenta cv")
    List<Auto> buscarAutosVendidos();
    */

}
