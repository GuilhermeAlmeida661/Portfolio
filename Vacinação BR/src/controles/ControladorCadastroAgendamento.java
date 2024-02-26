package controles;
import entidades.Agendamento;
import interfaces.JanelaCadastroAgendamento;

public class ControladorCadastroAgendamento {
    
    public ControladorCadastroAgendamento(){
         new JanelaCadastroAgendamento(this).setVisible(true);
    }
    
    public String inserirAgendamento(Agendamento agendamento){
         if(!Agendamento.existeAgendamento(agendamento.getPaciente().getCPF(), agendamento.getCampanha().getSequencial())){
            return Agendamento.inserirAgendamento(agendamento);
         }
         else return "Agendamento já Cadastrado";
    }
    
    public String alterarAgendamento(Agendamento agendamento_informado){
         Agendamento agendamento_cadastrado = Agendamento.buscarAgendamento(agendamento_informado.getSequencial());
         if((agendamento_informado.getPaciente().getCPF().equals(agendamento_cadastrado.getPaciente().getCPF()))
                  && (agendamento_informado.getCampanha().getSequencial() == agendamento_cadastrado.getCampanha().getSequencial())) {
                        return Agendamento.alterarAgendamento(agendamento_informado);
         }
         else return "Alteração não permitida: A chave do Paciente ou da Campanha foi alterada ";
    }
    
    public String removerAgendamento(Integer sequencial){
         if(Agendamento.existeAgendamento(sequencial)) 
             return Agendamento.removerAgendamento(sequencial);
         else return "Sequencial não corresponde a nenhum agendamento cadastrado";
    }
}
