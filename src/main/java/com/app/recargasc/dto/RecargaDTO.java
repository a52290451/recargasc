package com.app.recargasc.dto;

import java.time.LocalDateTime;

public class RecargaDTO {
    private Long id_recarga;
    private LocalDateTime fecha;
    private int monto;
    private boolean estado;
    private Long telefono;
    private Long id_operador;
    private Long id_usuario;
    private Long id_ven;

    public RecargaDTO(Long id_recarga, LocalDateTime fecha, int monto, boolean estado, Long telefono,
                      Long id_operador, Long id_usuario, Long id_ven) {
        this.id_recarga = id_recarga;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = estado;
        this.telefono = telefono;
        this.id_operador = id_operador;
        this.id_usuario = id_usuario;
        this.id_ven = id_ven;
    }

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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Long getId_operador() {
        return id_operador;
    }

    public void setId_operador(Long id_operador) {
        this.id_operador = id_operador;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_ven() {
        return id_ven;
    }

    public void setId_ven(Long id_ven) {
        this.id_ven = id_ven;
    }

}
