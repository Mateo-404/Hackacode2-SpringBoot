package com.example.demo.model;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
@PrimaryKeyJoinColumn(name = "id")
@Entity
public class Cliente extends Persona {
    //Constructor
    Cliente() {
    }
    Cliente (Long id, String name, String lastName, String adress, String phone, String email, String dni, String nationality, LocalDate birthDate){
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
    @Override
    public String getAdress() {
        return super.getAdress();
    }

    @Override
    public LocalDate getBirthDate() {
        return super.getBirthDate();
    }

    @Override
    public String getDni() {
        return super.getDni();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getNationality() {
        return super.getNationality();
    }

    @Override
    public String getPhone() {
        return super.getPhone();
    }

    @Override
    public void setAdress(String adress) {
        super.setAdress(adress);
    }

    @Override
    public void setBirthDate(LocalDate birthDate) {
        super.setBirthDate(birthDate);
    }

    @Override
    public void setDni(String dni) {
        super.setDni(dni);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setNationality(String nationality) {
        super.setNationality(nationality);
    }

    @Override
    public void setPhone(String phone) {
        super.setPhone(phone);
    }
        
}

