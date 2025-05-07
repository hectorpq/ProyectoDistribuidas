package com.example.mspagosservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double monto;
    private String metodoPago;
    private String estado; // Puede ser "pendiente", "completado", "fallido"
    private LocalDateTime fecha;

    public Pagos() {
        this.fecha = LocalDateTime.now();
    }

    public Pagos(Integer id, Double monto, String metodoPago, String estado, LocalDateTime fecha) {
        this.id = id;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.estado = estado;
        this.fecha = fecha;
    }

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

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pagos{" +
                "id=" + id +
                ", monto=" + monto +
                ", metodoPago='" + metodoPago + '\'' +
                ", estado='" + estado + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
