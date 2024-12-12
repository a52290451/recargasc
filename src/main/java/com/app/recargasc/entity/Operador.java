package com.app.recargasc.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "operador")
public class Operador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_operador;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private String tipo_operador;

    // Getter for id_operador
    public Long getId_operador() {
        return id_operador;
    }

    // Setter for id_operador
    public void setId_operador(Long id_operador) {
        this.id_operador = id_operador;
    }

    // Getter for descripcion
    public String getDescripcion() {
        return descripcion;
    }

    // Setter for descripcion
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter for tipo_operador
    public String getTipo_operador() {
        return tipo_operador;
    }

    // Setter for tipo_operador
    public void setTipo_operador(String tipo_operador) {
        this.tipo_operador = tipo_operador;
    }

}
