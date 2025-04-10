package com.example.mspagosservice.service.impl;

import com.example.mspagosservice.entity.Pagos;
import com.example.mspagosservice.repository.PagosRepository;
import com.example.mspagosservice.service.PagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagosServiceImpl implements PagosService {
    @Autowired
    private PagosRepository pagosRepository;

    @Override
    public List<Pagos> listar() {
        return pagosRepository.findAll();
    }

    @Override
    public Optional<Pagos> buscar(Integer id) {
        return pagosRepository.findById(id);
    }

    @Override
    public Pagos guardar(Pagos pagos) {
        return pagosRepository.save(pagos);
    }

    @Override
    public Pagos actualizar(Integer id, Pagos pagos) {
        pagos.setId(id);
        return pagosRepository.save(pagos);
    }

    @Override
    public void eliminar(Integer id) {
        pagosRepository.deleteById(id);
    }
}
