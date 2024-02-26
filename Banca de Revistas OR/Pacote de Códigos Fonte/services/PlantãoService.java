package services;

import entities.Plantão;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;


@Stateless
public class PlantãoService extends EntityService<Plantão>{

    public PlantãoService(){
        super(Plantão.class);
    }
    
     public List<Plantão> filter(String prefix){
        prefix += "%";
        Query query = em.createQuery("Select plantão from Plantão plantão where plantão.código_Plantão LIKE :prefix");
        query.setParameter("prefix", prefix);
        return query.getResultList();
    }
}
