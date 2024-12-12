package com.app.recargasc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vendedor")
public class Vendedor {

    // Default constructor (if required)


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ven;
    private String nombre_vendedor;
    private String direccion;

    public Vendedor() {}

    public Vendedor(Long id_ven) {
        this.id_ven = id_ven;
    }

    public Long getId_ven() {
        return id_ven;
    }

    public void setId_ven(Long id_ven) {
        this.id_ven = id_ven;
    }

    public String getNombre_vendedor() {
        return nombre_vendedor;
    }

    public void setNombre_vendedor(String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
