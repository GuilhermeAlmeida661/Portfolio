package com.vendasteste.vendas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Integer id_produto;
    
    @Column(name = "Nome_prod")
    private String nome_produto;
    
    @Column(name = "Cod_prod")
    private Integer codigo_produto;
    
    @Column(name = "preco_prod")
    private Double preco_produto;
    
    @Column(name = "qtd_prod")
    private Integer quantidade_produto;
    
    @Column(name = "disp_prod")
    private boolean produto_disponivel;
    
    //private Pedidos pedidos;
    
    public Produto(){}
    
    public Produto(String nome_produto, Integer codigo_produto){
        this.nome_produto=nome_produto;
        this.codigo_produto=codigo_produto;
    }
    
    public Produto(String nome_produto, Integer codigo_produto, Double preco_produto, Integer quantidade_produto, boolean produto_disponivel){
        this.nome_produto = nome_produto;
        this.codigo_produto = codigo_produto;
        this.preco_produto = preco_produto;
        this.quantidade_produto = quantidade_produto;
        this.produto_disponivel = produto_disponivel;
    }

    public Integer getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public Integer getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(Integer codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public Double getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(Double preco_produto) {
        this.preco_produto = preco_produto;
    }

    public Integer getQuantidade_produto() {
        return quantidade_produto;
    }

    public void setQuantidade_produto(Integer quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }
    
    //Transformar a saída para sim ou não//
    public boolean isProduto_disponivel() {
        return produto_disponivel;
    }

    public void setProduto_disponivel(boolean produto_disponivel) {
        this.produto_disponivel = produto_disponivel;
    }
    
    @Override
    public String toString(){
        return "Produto{ " + "Nome do Produto: " + getNome_produto() + '\'' + "Código do Produto: " + getCodigo_produto() + '\'' +
               "Preço do Produto: " + getPreco_produto() + '\'' + "Quantidade do Produto: " + getQuantidade_produto() + '\'' +
               "Há Disponibilidade do Produto? " + isProduto_disponivel() + '\'' + "}";
    }
}
