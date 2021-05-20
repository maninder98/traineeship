package pubs;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class AuthorDao extends Dao<Author> {

    public static final EntityManager em = Persistence.createEntityManagerFactory("MySQL-pubs")
            .createEntityManager();

    public AuthorDao(EntityManager em) {

        super(em);
    }

    private static AuthorDao<Author> instance;


    public static AuthorDao instance(EntityManager em) {
        if (instance == null) {

            instance = new AuthorDao(em);
        }
        return instance;
    }


    //remove

}
