package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Paquete;
import com.example.demo.service.IPaqueteService;

@RequestMapping("/paquete")
@RestController
public class PaqueteController implements IPaqueteService{
    @Autowired
    IPaqueteService service;
    //<-- CRUD -->
    @DeleteMapping("/delete")
    public void delete(@RequestBody Paquete paquete) {
        service.delete(paquete);
    }

    @GetMapping("/all")
    public List<Paquete> findAllPaquetes() {
        return service.findAllPaquetes();
    }

    @GetMapping("/findbyid/{id}")
    public Paquete findByPaquete(@PathVariable Long id) {
        return service.findByPaquete(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Paquete paquete) {
        service.save(paquete);
    }

    @PostMapping("/update")
    public void update(@RequestBody Paquete paquete) {
        service.update(paquete);
    }
    
}
