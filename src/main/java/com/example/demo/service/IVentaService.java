package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.VentaDto;

public interface IVentaService {
    //CRUD
    public void save(VentaDto venta);

    public void delete(VentaDto venta);

    public void update(VentaDto venta);

    public List<VentaDto> findAllVentas();

    public VentaDto findByVenta(Long id);

}
