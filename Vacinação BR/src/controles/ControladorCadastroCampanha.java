package controles;

import entidades.Campanha;
import interfaces.JanelaCadastroCampanha;

public class ControladorCadastroCampanha {
        
    
    public ControladorCadastroCampanha(){
      new JanelaCadastroCampanha(this).setVisible(true);
    }
        
    public String inserirCampanhaCadastrada(Campanha campanha){
        Campanha campanha1 =  Campanha.consultarCampanha(campanha.getSequencial());
        if(campanha1 != null){
            if(! Campanha.existeCampanhaMesmosAtributos(campanha)){
                    return Campanha.inserirCampanha(campanha);
            } else return "Já existe uma Campanha com os mesmos Atributos";
         }
        return Campanha.inserirCampanha(campanha);
        }

    public String alterarCampanhaCadastrada(Campanha campanha){
        Campanha campanha1 = Campanha.consultarCampanha(campanha.getSequencial());
        if(campanha1 != null){
            return Campanha.alterarCampanha(campanha);
        }
        else{
            return "Campanha não cadastrada";
        }
    }

    public String removerCampanhaCadastrada(Integer sequencial){
        Campanha campanha1 = Campanha.consultarCampanha(sequencial);
        if(campanha1 != null){
            return Campanha.removerCampanha(campanha1);
        }
        else{
            return "Campanha não cadastrada";
        }
    }
}
