package com.app.recargasc.dto;

public class RecargaSumaDTO {
    private Long id_operador;
    private String tipo_operador;
    private Long count;
    private Long sumMonto;

    // Constructor
    public RecargaSumaDTO(Long id_operador,String tipo_operador, Long count, Long sumMonto) {
        this.id_operador = id_operador;
        this.count = count;
        this.sumMonto = sumMonto;
        this.tipo_operador = tipo_operador;
    }

    // Getters y setters
    public Long getId_operador() {
        return id_operador;
    }

    public void setId_operador(Long id_operador) {
        this.id_operador = id_operador;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getSumMonto() {
        return sumMonto;
    }

    public void setSumMonto(Long sumMonto) {
        this.sumMonto = sumMonto;
    }

    public String getTipo_operador() {
        return tipo_operador;
    }

    // Setter
    public void setTipo_operador(String tipo_operador) {
        this.tipo_operador = tipo_operador;
    }
}
