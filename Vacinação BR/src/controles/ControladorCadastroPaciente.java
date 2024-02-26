package controles;

import entidades.Paciente;
import interfaces.JanelaCadastroPaciente;

public class ControladorCadastroPaciente{
    

public ControladorCadastroPaciente(){
        new JanelaCadastroPaciente(this).setVisible(true);
}

public String inserirPacienteCadastrado(Paciente paciente){
    Paciente paciente1 = Paciente.consultarPaciente(paciente.getCPF());
    if(paciente1 == null){
        return Paciente.inserirPaciente(paciente);
    }
    else{
        return "CPF do paciente já cadastrado";
    }
}

public String alterarPacienteCadastrado(Paciente paciente){
     Paciente paciente1 = Paciente.consultarPaciente(paciente.getCPF());
    if(paciente1 != null){
        return Paciente.alterarPaciente(paciente);
     }
    else{
        return "CPF do paciente não cadastrado";
    }
}

public String removerPacienteCadastrado(String CPF){
     Paciente paciente1 = Paciente.consultarPaciente(CPF);
    if(paciente1 != null){
        return Paciente.removerPaciente(CPF);
    }
    else{
        return "CPF do paciente não cadastrado";
    }
}

}
