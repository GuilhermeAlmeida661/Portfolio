package entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import javax.persistence.ManyToOne;

@Entity
public class Plantão implements Serializable, PersistentEntity {
    
    private String código_Plantão;
    
    @Temporal(TemporalType.TIME)
    private Date dataPlantão = new Date();
    
    @Temporal(TemporalType.DATE)
    private Date dataAuditoria;
    
    @ManyToOne
    private Paciente paciente;
    
    @ManyToOne
    private Ala ala;
    
    @ManyToOne
    private Servidor servidor;

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
        
        if (!(object instanceof Plantão)) {
            return false;
        }
        Plantão other = (Plantão) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "entities.Plantão[ id=" + id + " ]";
    }

    public Date getDataAuditoria() {
        return dataAuditoria;
    }

    public void setDataAuditoria(Date dataAuditoria) {
        this.dataAuditoria = dataAuditoria;
    }

    public String getCódigo_Plantão() {
        return código_Plantão;
    }

    public void setCódigo_Plantão(String código_Plantão) {
        this.código_Plantão = código_Plantão;
    }

    public Date getDataPlantão() {
        return dataPlantão;
    }

    public void setDataPlantão(Date dataPlantão) {
        this.dataPlantão = dataPlantão;
    }

    public Ala getAla() {
        return ala;
    }

    public void setAla(Ala ala) {
        this.ala = ala;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
