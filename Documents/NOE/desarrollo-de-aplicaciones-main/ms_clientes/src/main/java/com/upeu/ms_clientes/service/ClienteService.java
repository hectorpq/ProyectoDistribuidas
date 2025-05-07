package com.upeu.ms_clientes.service;

import com.upeu.ms_clientes.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    List<Cliente> listar();

    Optional<Cliente> buscar(Integer id);

    Cliente guardar(Cliente cliente);

    Cliente actualizar(Integer id, Cliente cliente);

    void eliminar(Integer id);
}
