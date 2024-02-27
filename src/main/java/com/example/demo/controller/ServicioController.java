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

import com.example.demo.model.Servicio;
import com.example.demo.service.IServicioService;

@RequestMapping("/servicio")
@RestController
public class ServicioController implements IServicioService{
    @Autowired
    IServicioService service;
    //<-- CRUD -->
    @DeleteMapping("/delete")
    public void delete(@RequestBody Servicio servicio) {
        service.delete(servicio);
    }

    @GetMapping("/all")
    public List<Servicio> findAllServicios() {
        return service.findAllServicios();
    }

    @GetMapping("/findbyid/{id}")
    public Servicio findByServicio(@PathVariable Long id) {
        return service.findByServicio(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Servicio servicio) {
        service.save(servicio);
    }

    @PutMapping("/update")
    public void update(@RequestBody Servicio servicio) {
        service.update(servicio);
    }
    
}
