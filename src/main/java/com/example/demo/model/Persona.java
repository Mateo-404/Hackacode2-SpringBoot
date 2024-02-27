package com.example.demo.model;

import java.time.LocalDate;


import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Inheritance(strategy = InheritanceType.JOINED)
@Entity
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
    
    public Persona() {
    }

    public Persona(Long id, String name, String lastName, String adress, String phone, String email, String dni,
            String nationality, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.dni = dni;
        this.nationality = nationality;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    
}
