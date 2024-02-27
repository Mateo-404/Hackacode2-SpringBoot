package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Servicio;

public interface IServicioService {
    //CRUD
    public void save(Servicio servicio);
    public void delete(Servicio servicio);
    public void update(Servicio servicio);
    public List<Servicio> findAllServicios();
    public Servicio findByServicio(Long id);
}
