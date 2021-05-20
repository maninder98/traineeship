package pubs;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class Dao<T> {

    private EntityManager em;

    public Dao(EntityManager em) {
        this.em = em;
    }

    public Author find(long id) {
        return em.find(Author.class, id);  //select...where id = ... = find
    }

    public void save(Author a) {
        em.getTransaction().begin();
        em.persist(a); //Insert = persist
        em.getTransaction().commit();
    }


    public List<Author> findAll() {
        return em.createNamedQuery("findAll", Author.class).getResultList(); //jpql
    }

    public Author update(Author a) {
        em.getTransaction().begin();
        Author mergedP = em.merge(a);//update...
        em.getTransaction().commit();
        return mergedP;
    }

    public void remove(Author a) {
        em.getTransaction().begin();
        Author Author = find(a.getId());
        em.remove(Author); //delete
        em.getTransaction().commit();


    }


}
