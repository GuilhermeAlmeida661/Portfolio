package com.fidelis.controllers;

import com.fidelis.entities.Catequizando;
import com.fidelis.interfaces.JanelaCadastroCatequizando;

public class Controlador_Cadastro_Catequizando {

    public Controlador_Cadastro_Catequizando(){
        new JanelaCadastroCatequizando(this).setVisible(true);
    }

        //Catequizando controller
 
    public String inserirCatequizandoCadastrado(Catequizando catequizando){
        Catequizando catequizando1 = Catequizando.consultarCatequizandos(catequizando.getId());
        if(catequizando1 == null){
            return Catequizando.inserirCatequizandos(catequizando);
        }
        else{
            return "Catequizando já cadastrado";
        }
    }
    
    public String editarCatequizandoCadastrado(Catequizando catequizando){
        Catequizando catequizando1 = Catequizando.consultarCatequizandos(catequizando.getId());
        if(catequizando1 != null){
            return Catequizando.editarCatequizandos(catequizando);
         }
        else{
            return "Catequizando não cadastrado";
        }
    }
    
    public String removerCatequizandoCadastrado(int id){
        Catequizando catequizando1 = Catequizando.consultarCatequizandos(id);
        if(catequizando1 != null){
            return Catequizando.removerCatequizandos(catequizando1.getId());
        }
        else{
            return "Catequizando não cadastrado";
        }
    }
}
