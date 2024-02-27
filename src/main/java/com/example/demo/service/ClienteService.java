package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.repository.IClienteRepository;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    IClienteRepository repository;

    @Override
    public void delete(Cliente cliente) {
        repository.delete(cliente);
    }

    @Override
    public List<Cliente> findAllClientes() {
        return repository.findAll();
    }

    @Override
    public Cliente findByCliente(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Cliente cliente) {
        repository.save(cliente);
    }

    @Override
    public void update(Cliente cliente) {
        repository.save(cliente);
    }


    
}
