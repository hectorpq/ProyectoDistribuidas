package com.example.mspagosservice.util;

import com.example.mspagosservice.entity.Pagos;
import com.example.mspagosservice.repository.PagosRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PagosSeeder implements CommandLineRunner {
    private final PagosRepository pagosRepository;

    public PagosSeeder(PagosRepository pagosRepository) {
        this.pagosRepository = pagosRepository;
    }

    @Override
    public void run(String... args) {

        if (pagosRepository.count() == 0) { // Verifica si la tabla está vacía
            // Crear objetos de pagos
            Pagos pago1 = new Pagos(null, 100.00, "Tarjeta de Crédito", "Completado");
            Pagos pago2 = new Pagos(null, 50.00, "Efectivo", "Pendiente");

            // Guardar en la base de datos
            pagosRepository.save(pago1);
            pagosRepository.save(pago2);

            System.out.println("✅ Datos de pagos insertados correctamente.");
        }  else {
            System.out.println("Los pagos ya existen, no se insertaron datos.");
        }
    }
}
