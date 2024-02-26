package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Servicio;

@Repository
public interface IServicioRepository extends JpaRepository<Servicio, Long> {
}
