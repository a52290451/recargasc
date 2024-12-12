package com.app.recargasc.entity;


import jakarta.persistence.*;



import java.time.LocalDateTime;


@Entity
@Table(name = "recarga")
public class Recarga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_recarga;
    private LocalDateTime fecha;
    private int monto;
    private boolean estado;
    private Long telefono;

    @ManyToOne
    @JoinColumn(name = "idOperador")
    private Operador idOperador;

    @ManyToOne
    @JoinColumn(name = "cedula")
    private Usuario id_usuario;

    @ManyToOne
    @JoinColumn(name = "id_ven")
    private Vendedor id_ven;

    public Long getId_recarga() {
        return id_recarga;
    }

    public void setId_recarga(Long id_recarga) {
        this.id_recarga = id_recarga;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Operador getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(Operador idOperador) {
        this.idOperador = idOperador;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Vendedor getId_ven() {
        return id_ven;
    }

    public void setId_ven(Vendedor id_ven) {
        this.id_ven = id_ven;
    }

    public boolean isEstado() {
        return estado;
    }

    // Setter for estado
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Getter for telefono
    public Long getTelefono() {
        return telefono;
    }

    // Setter for telefono
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

}
