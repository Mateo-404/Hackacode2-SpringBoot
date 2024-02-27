package com.example.demo.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
@PrimaryKeyJoinColumn(name = "id")
@Entity
public class Empleado extends Persona {
    @Basic
    private String position;
    private double salary;
}
