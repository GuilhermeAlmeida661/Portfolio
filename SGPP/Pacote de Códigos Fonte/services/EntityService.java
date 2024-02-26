package services;

import entities.PersistentEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public abstract class EntityService<T extends PersistentEntity> {
    @PersistenceContext(unitName = "BancaRevistasORPU")
    protected EntityManager em;
    
    private final Class<T> entityClass;

    public EntityService(Class<T> entityClass) {
        this.entityClass = entityClass;
    } 

    public void create(T entity) {
        em.persist(entity);
    }

    public void edit(T entity) {
        em.merge(entity);
    }

    public void remove(T entity) {
        em.remove(em.merge(entity));
    }

    public T find(Object id) {
        return em.find(entityClass, id);
    }

    public List<T> getAll() {
        CriteriaQuery query = em.getCriteriaBuilder().createQuery();
        query.select(query.from(entityClass));
        return em.createQuery(query).getResultList();
    }
 
    public Long getCount() {
        CriteriaQuery query = em.getCriteriaBuilder().createQuery();
        Root<T> root = query.from(entityClass);
        query.select(em.getCriteriaBuilder().count(root));
        return (Long) em.createQuery(query).getSingleResult();
    }
    protected T attach(T entity){
        return find(entity.getId());
    }
}
