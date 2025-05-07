package com.example.mspagosservice.service;

import com.example.mspagosservice.entity.Pagos;

import java.util.List;
import java.util.Optional;

public interface PagosService {
    List<Pagos> listar();
    Optional<Pagos> buscar(Integer id);
    Pagos guardar(Pagos pagos);
    Pagos actualizar(Integer id, Pagos pagos);
    void eliminar(Integer id);
}
