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

import com.example.demo.model.Cliente;
import com.example.demo.service.IClienteService;

@RequestMapping("/cliente")
@RestController
public class ClienteController{
    @Autowired
    IClienteService service;

    //<-- CRUD -->
    @DeleteMapping("/delete")
    public void delete(@RequestBody Cliente cliente) {
        service.delete(cliente);
    }

    @GetMapping("/all")
    public List<Cliente> findAllClientes() {
        return service.findAllClientes();
    }

    @GetMapping("/findbyid/{id}")
    public Cliente findByCliente(@PathVariable Long id) {
        return service.findByCliente(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Cliente cliente) {
        service.save(cliente);
    }

    @PutMapping("/update")
    public void update(@RequestBody Cliente cliente) {
        service.update(cliente);
    }
    
}
