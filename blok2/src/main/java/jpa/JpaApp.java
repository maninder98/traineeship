package jpa;

import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static jpa.PersonDao.*;

@Log4j2
public class JpaApp {

    /*Logger log = LoggerFactory.getLogger(JpaApp.class);*/

    public static void main(String[] args) {
        new JpaApp().start();
    }

    private void start() {
        PersonDao personDao = PersonDao.INSTANCE;

        Person person = personDao.find(1);
        System.out.println(person);

        //adding
        Person p = Person.builder().name("Piet").age(23).build();
        personDao.save(p);

        //findall
        log.debug(" All perspons ");
        List<Person> all = personDao.findAll();
        all.forEach(ps -> log.debug(ps.toString()));


        //updating
        personDao.updateName(person, "Harry");

        em.clear();

        personDao.updateNameOnDetachedEntity(p, " Thomas");

        p.setName("Maninder");

        Person updatedP = personDao.update(p);

        personDao.remove(p);


    }
}
