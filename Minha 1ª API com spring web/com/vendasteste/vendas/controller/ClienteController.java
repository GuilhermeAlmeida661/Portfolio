package com.vendasteste.vendas.controller;

import com.vendasteste.vendas.model.Cliente;
import com.vendasteste.vendas.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/clientes")
public class ClienteController{
    
    @Autowired
    private ClienteRepository repository;
    
    @GetMapping()
    public List<Cliente>getClientes(){
       return repository.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Cliente> getById(@PathVariable("id") Integer id){
        return repository.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    
    @PutMapping("/{id}")
    public void atualizarCliente(@PathVariable("id") Integer id, @RequestBody Optional<Cliente> clienteAtualizado){
        Optional<Cliente> clienteExistente = repository.findById(id);
        if(clienteExistente != null){
            clienteExistente.get().setLogin(clienteAtualizado.get().getLogin());
            clienteExistente.get().setPassword(clienteAtualizado.get().getPassword());
            repository.save(clienteExistente);
        } 
    }
    
    @PostMapping()
    public void postCliente(@RequestBody Cliente cliente){
        repository.save(cliente);
    }
}
