package com.example.mspagosservice.controller;

import com.example.mspagosservice.entity.Pagos;
import com.example.mspagosservice.service.PagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pagos")
public class PagosController {

    @Autowired
    private PagosService pagosService;

    @RequestMapping
    public List<Pagos> listar() {
        return pagosService.listar();
    }

    @RequestMapping("/{id}")
    public Optional<Pagos> buscar(@PathVariable Integer id) {
        return pagosService.buscar(id);
    }

    @PostMapping
    public Pagos guardar(@RequestBody Pagos pagos) {
        return pagosService.guardar(pagos);
    }

    @PutMapping("/{id}")
    public Pagos actualizar(@PathVariable Integer id, @RequestBody Pagos pagos) {
        return pagosService.actualizar(id, pagos);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        pagosService.eliminar(id);
    }
}
