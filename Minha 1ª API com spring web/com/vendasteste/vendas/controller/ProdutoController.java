package com.vendasteste.vendas.controller;

import com.vendasteste.vendas.model.Produto;
import com.vendasteste.vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Endpoint para obter todos os produtos
    @GetMapping
    public List<Produto> obterTodosProdutos() {
        return produtoRepository.findAll();
    }

    // Endpoint para obter um produto por ID
    @GetMapping("/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable Integer id) {
        return produtoRepository.findById(id);
    }

    // Endpoint para criar um novo produto
    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    // Endpoint para atualizar um produto existente
    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable Integer id, @RequestBody Produto produtoAtualizado) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produtoRepository.save(produto);
    }

    // Endpoint para excluir um produto
    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable Integer id) {
        produtoRepository.deleteById(id);
    }
}