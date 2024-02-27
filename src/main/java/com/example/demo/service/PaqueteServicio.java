package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Paquete;
import com.example.demo.repository.IPaqueteRepository;

@Service
public class PaqueteServicio implements IPaqueteService{
    @Autowired
    IPaqueteRepository repository;

    @Override
    public void delete(Paquete paquete) {
        repository.delete(paquete);
    }

    @Override
    public List<Paquete> findAllPaquetes() {
        return repository.findAll();
    }

    @Override
    public Paquete findByPaquete(Long id) {
        return (Paquete) repository.findById(id).orElse(null);
    }

    @Override
    public void save(Paquete paquete) {
        repository.save(paquete);
    }

    @Override
    public void update(Paquete paquete) {
        repository.save(paquete);
    }

    
}
