package beans;

import entities.Paciente;
import java.io.Serializable;
import util.RequestParameters;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import services.PacienteService;
import org.primefaces.event.FlowEvent;
import javax.faces.model.SelectItem;


@Named(value = "pacienteBean")
@ViewScoped
public class PacienteBean implements Serializable{
    
@EJB
private PacienteService pacienteService;

@Inject
private RequestParameters parameters;

private Paciente value;

private boolean consultar = false;

private List<Paciente> pacientesFiltrados;


@PostConstruct
public void init(){
    String id = parameters.get("id");
    if(id == null) value = new Paciente();
    else value = pacienteService.find(Long.valueOf(id));
}
    
public Paciente getValue(){
    return value;
}

public void setValue(Paciente value){
    this.value = value;
}

public void reset(){
    value = new Paciente();
}

public void inserir(){
    reset();
    this.consultar = false;
}

public void consultar(Paciente value){
    setValue(value);
    this.consultar = true;
}

public List<Paciente> getAll(){
    return pacienteService.getAll();
}

public String onFlowProcess(FlowEvent event){
    return event.getNewStep();
}

public String save(){
    pacienteService.create(value);
    reset();
    return null;
}

public String update(){
    pacienteService.edit(value);
    return null;
}

public String delete(){
    pacienteService.remove(value);
    return null;
}

public boolean getConsultar() {
    return consultar;
}

public void setConsultar(boolean consultar) {
    this.consultar = consultar;
}

public List<Paciente> getPacientesFiltrados() {
    return pacientesFiltrados;
}

public void setPacientesFiltrados(List<Paciente> pacientesFiltrados) {
    this.pacientesFiltrados = pacientesFiltrados;
    }

public SelectItem[] getEstadosCivis(boolean filtrar){
    SelectItem[] items;
    int length = Paciente.EstadoCivil.values().length;
    int n = 0;
    if(filtrar){
        items = new SelectItem[length +1];
        items[0] = new SelectItem("", "");
        n++;
    }else items = new SelectItem[length];
    for(Paciente.EstadoCivil estado_civil : Paciente.EstadoCivil.values()){
        items[n++] = new SelectItem(estado_civil, estado_civil.getLabel());
    }
    return items;
}

public SelectItem[] getSexo(boolean filtrar){
    SelectItem[] items;
    int length = 2;
    int n = 0;
    if(filtrar){
        items = new SelectItem[length +1];
        items[0] = new SelectItem("", "");
        n++;
    }else items = new SelectItem[length];
        
    items[n++] = new SelectItem("feminino", "Feminino");
    items[n++] = new SelectItem("masculino", "Masculino");

    return items;
    }

public List<Paciente> completaPacientes(String prefixo){
    return pacienteService.filter(prefixo);
    }

}

