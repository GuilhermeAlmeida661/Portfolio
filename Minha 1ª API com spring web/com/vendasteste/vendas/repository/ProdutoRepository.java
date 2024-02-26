package com.vendasteste.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vendasteste.vendas.model.Produto;
import java.util.Optional;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    public Produto save(Optional<Produto> produto);
}