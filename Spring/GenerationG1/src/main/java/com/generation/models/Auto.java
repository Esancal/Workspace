package com.generation.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "autos")

public class Auto {
    /*
     * Objeto o Entiedad (DTO, BEANS, POJO) Auto, Atributos, constructres, setter y
     * getter
     * JSP, controller, service y repository
     * id nombre marca color velocidadMax
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull()
    private String modelo;

    @NotNull()
    private String marca;

    @NotNull()
    private String color;

    @NotNull()
    private Integer velocidadMax;

    @Column(updatable = false) // Nos indica que esta columna no se puede actualizar por el sistema
    private Date createdAt;
    private Date updatedAt;

    public Auto() {
        super();
    }

    public Auto(Long id, String modelo, String marca, String color, Integer velocidadMax) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.velocidadMax = velocidadMax;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Integer velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    // Insertara en el atributo la fecha antedes de insertar a base de datos
    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

}
