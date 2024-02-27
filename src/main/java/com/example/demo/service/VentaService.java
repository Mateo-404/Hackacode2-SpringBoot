package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.VentaDto;
import com.example.demo.repository.IVentaRepository;

@Service
public class VentaService implements IVentaService{
    @Autowired
    IVentaRepository repository;

    @Override
    public void delete(VentaDto venta) {
        repository.delete(venta);
    }

    @Override
    public List<VentaDto> findAllVentas() {
        return repository.findAll();
    }

    @Override
    public VentaDto findByVenta(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(VentaDto venta) {
        repository.save(venta);
    }

    @Override
    public void update(VentaDto venta) {
        repository.save(venta);
    }

    
}
