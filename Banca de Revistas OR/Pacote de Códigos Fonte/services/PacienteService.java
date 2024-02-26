package services;

import entities.Paciente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;


@Stateless
public class PacienteService extends EntityService<Paciente>{

    public PacienteService(){
        super(Paciente.class);
    }
    public List<Paciente> filter(String prefix){
        prefix += "%";
        Query query = em.createQuery("Select paciente from Paciente paciente where paciente.Nome LIKE :prefix");
        query.setParameter("prefix", prefix);
        return query.getResultList();
    }
}
