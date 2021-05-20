package pubs;


import lombok.extern.log4j.Log4j2;

import java.util.List;

import static pubs.AuthorDao.em;

@Log4j2
public class pubsapp {

    public static void main(String[] args) {
        new pubsapp().start();
    }

    private void start() {
        AuthorDao authorDao = AuthorDao.instance();
        Author Author = authorDao.find(1);
        System.out.println(Author);

        //adding
        Author a = Author.builder().lastname("Piet").build();
        authorDao.save(a);

        //findall
        log.debug(" All authors ");
        List<Author> all = authorDao.findAll();
        all.forEach(ps -> log.debug(ps.toString()));


        em.clear();


        a.setLastname("Maninder");

        Author updatedP = authorDao.update(a);

        authorDao.remove(a);


    }
}
