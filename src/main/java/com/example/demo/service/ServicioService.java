package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Servicio;
import com.example.demo.repository.IServicioRepository;

@Service
public class ServicioService implements IServicioService{
    @Autowired
    IServicioRepository repository;

    @Override
    public void delete(Servicio servicio) {
        repository.delete(servicio);
    }

    @Override
    public List<Servicio> findAllServicios() {
        return repository.findAll();
    }

    @Override
    public Servicio findByServicio(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Servicio servicio) {
        repository.save(servicio);
    }

    @Override
    public void update(Servicio servicio) {
        repository.save(servicio);
    }


    
}
