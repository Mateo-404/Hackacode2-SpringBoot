package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Cliente;

public interface IClienteService {
    //CRUD
    public void save(Cliente cliente);
    
    public void delete(Cliente cliente);
    
    public void update(Cliente cliente);

    public List<Cliente> findAllClientes();

    public Cliente findByCliente(Long id);
}
