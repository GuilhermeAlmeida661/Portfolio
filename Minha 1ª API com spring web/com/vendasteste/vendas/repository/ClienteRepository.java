package com.vendasteste.vendas.repository;

import com.vendasteste.vendas.model.Cliente;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    public void save(Optional<Cliente> clienteExistente);
    
}
