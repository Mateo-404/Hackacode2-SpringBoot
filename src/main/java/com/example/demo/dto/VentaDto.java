package com.example.demo.dto;


import java.time.LocalDate;

import com.example.demo.model.Cliente;
import com.example.demo.model.Empleado;
import com.example.demo.model.Paquete;
import com.example.demo.model.Servicio;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

enum Medio_de_Pago {
    EFECTIVO, TARJETA_DEBITO, TARJETA_CREDITO, MONEDERO_VIRTUAL, TRANSFERENCIA
}

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity
public class VentaDto {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private Long num_venta;
    //Datos de la venta
    @Basic
    private Long id_servicio_paquete;
    private Medio_de_Pago medio_de_pago;
    private Double monto_neto;
    @Temporal(TemporalType.DATE)
    private LocalDate fecha;
    @OneToOne
    private Empleado empleado;
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Paquete paquete;
    @OneToOne
    private Servicio servicio;
}
