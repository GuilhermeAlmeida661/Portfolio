package services;

import entities.Servidor;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;


@Stateless
public class ServidorService extends EntityService<Servidor>{

    public ServidorService(){
        super(Servidor.class);
    }
    public List<Servidor> filter(String prefix){
        prefix += "%";
        Query query = em.createQuery("Select servidor from Servidor servidor where servidor.Nome LIKE :prefix");
        query.setParameter("prefix", prefix);
        return query.getResultList();
    }
}
