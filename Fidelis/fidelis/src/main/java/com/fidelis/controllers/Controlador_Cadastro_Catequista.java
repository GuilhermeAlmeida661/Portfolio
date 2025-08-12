package com.fidelis.controllers;

import com.fidelis.entities.Catequista;
import com.fidelis.interfaces.JanelaCadastroCatequista;

public class Controlador_Cadastro_Catequista {

    public Controlador_Cadastro_Catequista(){
        new JanelaCadastroCatequista(this).setVisible(true);
    }

        //Catequista controller

        public String inserirCatequistaCadastrado(Catequista catequista){ 
            Catequista catequista1 = Catequista.consultarCatequista(catequista.getId());
            if(catequista1 == null){
                return Catequista.inserirCatequista(catequista);
            }
            else{
                return "Catequista já cadastrado";
            }
        }
        
        public String editarCatequistaCadastrado(Catequista catequista){
            Catequista catequista1 = Catequista.consultarCatequista(catequista.getId());
            if(catequista1 != null){
                return Catequista.editarCatequista(catequista);
            }
            else{
                return "Id do Catequista não Cadastrado: " + catequista.getId();
            }
        }
        
        public String removerCatequistaCadastrado(int id){
            Catequista catequista1 = Catequista.consultarCatequista(id);
            if(catequista1 != null){
                return Catequista.removerCatequista(id);
            }
            else{
                return "Catequista não cadastrado";
            }
        }
}
