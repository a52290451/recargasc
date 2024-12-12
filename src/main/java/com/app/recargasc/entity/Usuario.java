package com.app.recargasc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario{



    @Id
    @Column(nullable = false)
    private Long cedula;

    private String nombre_usuario;
    private int telefono;

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
