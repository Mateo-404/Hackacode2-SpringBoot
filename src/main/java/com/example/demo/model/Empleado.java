package com.example.demo.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@SuperBuilder
@Setter @Getter
@Entity
public class Empleado extends Persona {
    @Basic
    private String position;
    private double salary;
}
