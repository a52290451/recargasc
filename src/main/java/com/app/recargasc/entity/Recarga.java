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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_operador")
    private Operador operador;

    @ManyToOne
    @JoinColumn(name = "cedula")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_ven")
    private Vendedor vendedor;

    public Recarga() {}

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

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
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
