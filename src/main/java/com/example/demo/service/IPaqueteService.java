package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Paquete;

public interface IPaqueteService {
    //CRUD
    public void save(Paquete paquete);
    public void delete(Paquete paquete);
    public void update(Paquete paquete);
    public List<Paquete> findAllPaquetes();
    public Paquete findByPaquete(Long id);
}
