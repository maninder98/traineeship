package h11;

import h10.Human;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void personTest() {
        Person p1 = new Person("Eghbol", 26);
        p1.printHistory();

        p1.addHistory("te veel freddies");
        p1.addHistory("te veel freddies");
        p1.addHistory("te veel freddies");
        p1.printHistory();

        Human human = p1.createSubHuman();
        String greet = human.greet();
        System.out.println(greet);
    }

    // Lab 14 Testing hascode tset

    @Test
    void testHashcodes() {
        HashSet<Person> persons = new HashSet<>();

        persons.add(new Person("Piet", 23));
        persons.add(new Person("Piet", 23));
        persons.add(new Person("Piet", 23));
        persons.add(new Person("Jan", 32));
        persons.add(new Person("Jan", 32));

        System.out.println(persons.size());
        assertTrue(persons.size() == 2);

    }

}

