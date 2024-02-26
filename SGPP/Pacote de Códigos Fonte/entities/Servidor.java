package entities;

import java.util.Date;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

@Entity
public class Servidor implements Serializable, PersistentEntity {

    public enum EstadoCivil{
    solteiro("solteiro"),casado("casado"),divorciado("divorciado"),viúvo("viúvo");
    
    private final String label;
    
    private EstadoCivil(String label){
        this.label = label;
    }
    public String getLabel(){
        return this.label;
    }
};

    private String Nome;
    private String Sexo;
    private String Idade;
    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;
    
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    private String cidade;
    
    private String função;
    private String ala;
        
    @Pattern(regexp="\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")
    private String email;
    
    @Pattern(regexp="((\\(\\d{2}\\) ?)|(\\d{2}-))?(\\d{5}|\\d{4})-\\d{4}")
    private String whatsapp;
    
    @OneToMany(mappedBy="servidor")
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
        
        if (!(object instanceof Servidor)) {
            return false;
        }
        Servidor other = (Servidor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Servidor[ id=" + id + " ]";
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getIdade() { 
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFunção() {
        return função;
    }

    public void setFunção(String função) {
        this.função = função;
    }

    public String getAla() {
        return ala;
    }

    public void setAla(String ala) {
        this.ala = ala;
    }

    public List<Plantão> getPlantão() {
        return plantão;
    }

    public void setPlantão(List<Plantão> plantão) {
        this.plantão = plantão;
    }
    
}
