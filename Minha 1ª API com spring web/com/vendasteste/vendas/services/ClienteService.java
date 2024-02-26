package com.vendasteste.vendas.services;

import com.vendasteste.vendas.model.Cliente;
import com.vendasteste.vendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }
    
     public Optional<Cliente> getClienteById(Integer id) {
        return clienteRepository.findById(id); 
    }

    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void deleteCliente(Integer id) {
        clienteRepository.deleteById(id);
    }
}