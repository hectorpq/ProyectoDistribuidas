package com.example.mspagosservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pagos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double monto;
    private String metodo;
    private String estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pagos(Integer id, Double monto, String metodo, String estado) {
        this.id = id;
        this.monto = monto;
        this.metodo = metodo;
        this.estado = estado;
    }

    public Pagos() {}

    @Override
    public String toString() {
        return "Pagos{" +
                "id=" + id +
                ", monto=" + monto +
                ", metodo='" + metodo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
