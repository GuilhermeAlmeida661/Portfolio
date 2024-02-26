package com.vendasteste.vendas.services;

import com.vendasteste.vendas.model.Produto;
import com.vendasteste.vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> getProdutoById(Integer id) {
        return produtoRepository.findById(id);
    }

    public void saveProduto(Produto produto) {
       produtoRepository.save(produto);
    }

    public void deleteProduto(Integer id) {
        produtoRepository.deleteById(id);
    }
}