package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.VentaDto;
import com.example.demo.service.IVentaService;

@RequestMapping("/venta")
@RestController
public class VentaController{
    @Autowired
    IVentaService service;

    //CRUD
    @DeleteMapping("/delete")
    public void delete(@RequestBody VentaDto venta) {
        service.delete(venta);
    }

    @GetMapping("/all")
    public List<VentaDto> findAllVentas() {
        return service.findAllVentas();
    }

    @GetMapping("/findbyid/{id}")
    public VentaDto findById(@PathVariable Long id) {
        return service.findByVenta(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody VentaDto venta) {
        service.save(venta);
    }

    @PutMapping("/update")
    public void update(@RequestBody VentaDto venta) {
        service.update(venta);
    }

    
}
