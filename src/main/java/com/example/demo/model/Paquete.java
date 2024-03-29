package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity
public class Paquete {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_paquete;
    @Basic
    private double costo_paquete; 
    //Relaciones
    @OneToMany
    private List<Servicio> servicios;
}
