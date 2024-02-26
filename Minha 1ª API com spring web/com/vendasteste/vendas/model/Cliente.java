package com.vendasteste.vendas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clientes")
    private Integer id_cliente;
    
    @Column(name = "login")
    private String login;
    
    @Column(name = "password")
    private String password;
    /*
    @Column(name = "endereço")
    private String endereco;
    
    @Column(name = "cidade")
    private String cidade;
    
    @Column(name = "estado")
    private String estado;
    */
    
    //private Pedido pedido;
    
    public Cliente(){}
    
    public Cliente(String login, String password){
        this.login = login;
        this.password = password;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    */
    @Override
    public String toString(){
        return"Cliente{" + " login='"+ getLogin() + '\'' + ", password='" + getPassword() + '\'' + "}";
    }
}
