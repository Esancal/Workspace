package com.generation.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Tabla relacional

@Entity
@Table(name = "Autos_Ventas")
public class AutoVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;
    private Float subtotal;
    private Date fecha;

    /** ManyToMany = 2 ManyToOne **/
    // ManyToOany Auto
    // ManyToOany CompraVenta

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "auto_id")
    private Auto auto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compra_venta_id")
    private CompraVenta compraVenta;

    public AutoVenta() {
    }

    public AutoVenta(Integer cantidad, Float subtotal, Date fecha) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
