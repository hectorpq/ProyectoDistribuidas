package com.example.mspagosservice.repository;

import com.example.mspagosservice.entity.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagosRepository extends JpaRepository<Pagos, Integer> {
    Integer id(Integer id);
}
