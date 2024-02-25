package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

enum tipo_servicio {
    HOTEL, ALQUILER_AUTO, EXCURSION, ENTRADA_EVENTO, PASAJE_AUTO, PASAJE_AVION, PASAJE_TREN
}
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo_servicio;
    @Basic
    private String nombre;
    private String descripcion_breve;
    private String destino_servicio;
    private Double costo_servicio;
    private tipo_servicio tipo_servicio;
    @Temporal(TemporalType.DATE)
    private LocalDate fecha_servicio;
}
