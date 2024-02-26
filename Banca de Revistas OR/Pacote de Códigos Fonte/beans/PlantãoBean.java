package beans;

import entities.Plantão;
import java.io.Serializable;
import util.RequestParameters;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import org.primefaces.event.FlowEvent;
import services.PlantãoService;

@Named(value = "plantãoBean")
@ViewScoped
public class PlantãoBean implements Serializable {
    
@EJB
private PlantãoService plantãoService;

@Inject
private RequestParameters parameters;

private Plantão value;

private boolean consultar = false;

private List<Plantão> plantõesFiltrados;

@PostConstruct
public void init(){
    String id = parameters.get("id");
    if(id == null) value = new Plantão();
    else value = plantãoService.find(Long.valueOf(id));
    }
    
public Plantão getValue(){
    return value;
    }

public void setValue(Plantão value){
    this.value = value;
    }

public void reset(){
    value = new Plantão();
    }

public void inserir(){
    reset();
    this.consultar = false;
    }

public void consultar(Plantão value){
    setValue(value);
    this.consultar = true;
    }

public List<Plantão> getAll(){
    return plantãoService.getAll();
    }

public String onFlowProcess(FlowEvent event){
    return event.getNewStep();
}

public String save(){
    plantãoService.create(value);
    reset();
    return null;
    }

public String update(){
    plantãoService.edit(value);
    return null;
    }

public String delete(){
    plantãoService.remove(value);
    return null;
    }

public boolean getConsultar() {
    return consultar;
}

public void setConsultar(boolean consultar) {
    this.consultar = consultar;
    }

public List<Plantão> getPlantõesFiltrados() {
    return plantõesFiltrados;
    }

public void setPlantõesFiltrados(List<Plantão> plantõesFiltrados) {
    this.plantõesFiltrados = plantõesFiltrados;
    }

}
