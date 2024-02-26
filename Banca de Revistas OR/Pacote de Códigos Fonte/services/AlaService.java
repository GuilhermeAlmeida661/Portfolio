package services;

import entities.Ala;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;


@Stateless
public class AlaService extends EntityService<Ala>{

    public AlaService(){
        super(Ala.class);
    }
    
     public List<Ala> filter(String prefix){
        prefix += "%";
        Query query = em.createQuery("Select ala from Ala ala where ala.Código_Ala LIKE :prefix");
        query.setParameter("prefix", prefix);
        return query.getResultList();
    }

}
