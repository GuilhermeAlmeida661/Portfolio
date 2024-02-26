package beans;

import entities.Ala;
import java.io.Serializable;
import util.RequestParameters;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import services.AlaService;
import javax.faces.model.SelectItem;


@Named(value = "alaBean")
@ViewScoped
public class AlaBean implements Serializable{
    
@EJB
private AlaService alaService;

@Inject
private RequestParameters parameters;

private Ala value;

private boolean consultar = false;

private List<Ala> AlasFiltradas;

@PostConstruct
public void init(){
    String id = parameters.get("id");
    if(id == null) value = new Ala();
    else value = alaService.find(Long.valueOf(id));
    }


public SelectItem[] getEspecialidade(boolean filtrar){
    SelectItem[] items;
    int length = Ala.Especialidade.values().length;
    int n = 0;
    if(filtrar){
        items = new SelectItem[length +1];
        items[0] = new SelectItem("", "");
        n++;
    }else items = new SelectItem[length];
    for(Ala.Especialidade especialidade : Ala.Especialidade.values()){
        items[n++] = new SelectItem(especialidade, especialidade.getLabel());
    }
    return items;
}
 
public Ala getValue(){
    return value;
    }

public void setValue(Ala value){
    this.value = value;
    }

public void reset(){
    value = new Ala();
    }

public void inserir(){
    reset();
    this.consultar = false;
    }

public void consultar(Ala value){
    setValue(value);
    this.consultar = true;
    }

public List<Ala> getAll(){
    return alaService.getAll();
    }

public String save(){
    alaService.create(value);
    reset();
    return null;
    }

public String update(){
    alaService.edit(value);
    return null;
    }

public String delete(){
    alaService.remove(value);
    return null;
    }

public boolean getConsultar() {
    return consultar;
}

public void setConsultar(boolean consultar) {
    this.consultar = consultar;
    }

public List<Ala> getAlasFiltradas() {
        return AlasFiltradas;
    }

public void setAlasFiltradas(List<Ala> AlasFiltradas) {
        this.AlasFiltradas = AlasFiltradas;
    }

public List<Ala> completaAlas(String prefixo){
    return alaService.filter(prefixo);
    }

}
