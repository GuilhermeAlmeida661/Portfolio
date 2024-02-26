package beans;

import entities.Servidor;
import java.io.Serializable;
import util.RequestParameters;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import services.ServidorService;
import org.primefaces.event.FlowEvent;
import javax.faces.model.SelectItem;


@Named(value = "servidorBean")
@ViewScoped
public class ServidorBean implements Serializable{
    
@EJB
private ServidorService servidorService;

@Inject
private RequestParameters parameters;

private Servidor value;

private boolean consultar = false;

private List<Servidor> servidoresFiltrados;


@PostConstruct
public void init(){
    String id = parameters.get("id");
    if(id == null) value = new Servidor();
    else value = servidorService.find(Long.valueOf(id));
}
    
public Servidor getValue(){
    return value;
}

public void setValue(Servidor value){
    this.value = value;
}

public void reset(){
    value = new Servidor();
}

public void inserir(){
    reset();
    this.consultar = false;
}

public void consultar(Servidor value){
    setValue(value);
    this.consultar = true;
}

public List<Servidor> getAll(){
    return servidorService.getAll();
}

public String onFlowProcess(FlowEvent event){
    return event.getNewStep();
}

public String save(){
    servidorService.create(value);
    reset();
    return null;
}

public String update(){
    servidorService.edit(value);
    return null;
}

public String delete(){
    servidorService.remove(value);
    return null;
}

public boolean getConsultar() {
    return consultar;
}

public void setConsultar(boolean consultar) {
    this.consultar = consultar;
}

public List<Servidor> getServidoresFiltrados() {
    return servidoresFiltrados;
}

public void setServidoresFiltrados(List<Servidor> servidoresFiltrados) {
    this.servidoresFiltrados = servidoresFiltrados;
    }

public SelectItem[] getEstadosCivis(boolean filtrar){
    SelectItem[] items;
    int length = Servidor.EstadoCivil.values().length;
    int n = 0;
    if(filtrar){
        items = new SelectItem[length +1];
        items[0] = new SelectItem("", "");
        n++;
    }else items = new SelectItem[length];
    for(Servidor.EstadoCivil estado_civil : Servidor.EstadoCivil.values()){
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

public List<Servidor> completaServidores(String prefixo){
    return servidorService.filter(prefixo);
    }
}

