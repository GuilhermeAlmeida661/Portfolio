package com.fidelis.controllers;

import com.fidelis.entities.Catequista;
import com.fidelis.entities.CatequistaDAO;

public class Controlador_Login {

    private CatequistaDAO catequistaDAO;

    public Controlador_Login(){
        this.catequistaDAO = new CatequistaDAO();
    }

    //verificar nome, senha, se é admin... se está ok e se existe esse usuário
    public Boolean Logar(String nome, String senha){
        Catequista catequista = catequistaDAO.buscarPorNome(nome);

        if(catequista != null && catequista.autenticar(nome, senha)){
            return true;
        }
        return false;
    }
}
