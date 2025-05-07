package com.example.mspagosservice.util;

import com.example.mspagosservice.entity.Pagos;
import com.example.mspagosservice.repository.PagosRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PagosSeeder implements CommandLineRunner {
    private final PagosRepository pagosRepository;

    public PagosSeeder(PagosRepository pagosRepository) {
        this.pagosRepository = pagosRepository;
    }

    @Override
    public void run(String... args) {
        // Eliminar todos los pagos (opcional)
        // pagosRepository.deleteAll();

        if (pagosRepository.count() == 0) { // Verifica si la tabla está vacía
            // Crear 5 objetos de pagos con el constructor adecuado
            Pagos pago1 = new Pagos(null, 150.0, "Tarjeta de Crédito", "completado", LocalDateTime.now().minusDays(1));
            Pagos pago2 = new Pagos(null, 200.0, "Efectivo", "pendiente", LocalDateTime.now().minusDays(2));
            Pagos pago3 = new Pagos(null, 250.0, "Transferencia Bancaria", "completado", LocalDateTime.now().minusDays(3));
            Pagos pago4 = new Pagos(null, 300.0, "PayPal", "fallido", LocalDateTime.now().minusDays(4));
            Pagos pago5 = new Pagos(null, 120.0, "Tarjeta de Crédito", "completado", LocalDateTime.now().minusDays(5));

            // Guardar en la base de datos
            pagosRepository.save(pago1);
            pagosRepository.save(pago2);
            pagosRepository.save(pago3);
            pagosRepository.save(pago4);
            pagosRepository.save(pago5);

            System.out.println("Datos de pagos insertados correctamente.");
        } else {
            System.out.println("Los pagos ya existen, no se insertaron datos.");
        }
    }
}
