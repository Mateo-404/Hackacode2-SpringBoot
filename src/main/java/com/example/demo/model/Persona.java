package com.example.demo.model;

import java.time.LocalDate;


import jakarta.persistence.Basic;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
abstract public class Persona {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    protected Long id;
    @Basic
    protected String name;
    protected String lastName;
    protected String adress;
    protected String phone;
    protected String email;
    protected String dni;
    protected String nationality; 
    @Temporal(TemporalType.DATE)
    protected LocalDate birthDate;
}
