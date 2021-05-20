package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public enum PersonDao {

    INSTANCE;

    public static final EntityManager em = Persistence.createEntityManagerFactory("MySQL-jpademo")
            .createEntityManager();

    public Person find(long id) {
        return em.find(Person.class, id);  //select...where id = ... = find
    }

    public void save(Person p) {
        em.getTransaction().begin();
        em.persist(p); //Insert = persist
        em.getTransaction().commit();
    }

    public void updateName(Person p, String name) {
        em.getTransaction().begin();
        p.setName(name);
        em.getTransaction().commit();
    }

    public void updateNameOnDetachedEntity(Person p, String name) {
        em.getTransaction().begin();
//        Person person = find(p.getId());
//        person.setName(name);
//        em.persist(person);
        p.setName(name);
        em.merge(p);
        em.getTransaction().commit();
    }


    public List<Person> findAll() {
        return em.createNamedQuery("findAll", Person.class).getResultList(); //jpql
    }

    public Person update(Person p) {
        em.getTransaction().begin();
        Person mergedP = em.merge(p);//update...
        em.getTransaction().commit();
        return mergedP;
    }

    public void remove(Person p) {
        em.getTransaction().begin();
        Person person = find(p.getId());
        em.remove(person); //delete
        em.getTransaction().commit();


    }

    //remove

}
