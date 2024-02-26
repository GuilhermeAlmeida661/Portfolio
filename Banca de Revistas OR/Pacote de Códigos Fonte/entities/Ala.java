package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Ala implements Serializable, PersistentEntity {
   
    public enum Especialidade{
    Administrativo("Administrativo"),Ambulatório("Ambulatório"),Centro_Cirurgico("Centro_Cirurgico"),Centro_Obstétrico("Centro_Obstétrico"),Cirurgia_Geral("Cirurgia_Geral"),Clínica("Clínica"),Enfermaria("Enfermaria"),Enfermaria_pediátrica("Enfermaria_pediátrica"),Pediatria("Pediatria"),Neurologia("Neurologia"),UTI("UTI"), UTI_Pediátrica("UTI_Pediátrica");
    
    private final String label;
    
    private Especialidade(String label){
        this.label = label;
    }
    public String getLabel(){
        return this.label;
    }
};
    
    private String Código_Ala;
    
    private boolean EstáLotada;
    
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    
    @OneToMany(mappedBy="ala")
    private List<Plantão> plantão;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Ala)) {
            return false;
        }
        Ala other = (Ala) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Ala[ id=" + id +" ]";
    }
    
    public String getCódigo_Ala() {
        return Código_Ala;
    }

    public void setCódigo_Ala(String Código_Ala) {
        this.Código_Ala = Código_Ala;
    }

    public boolean isEstáLotada() {
        return EstáLotada;
    }

    public void setEstáLotada(boolean EstáLotada) {
        this.EstáLotada = EstáLotada;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public List<Plantão> getPlantão() {
        return plantão;
    }

    public void setPlantão(List<Plantão> plantão) {
        this.plantão = plantão;
    }

}
