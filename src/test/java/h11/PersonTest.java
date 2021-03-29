package h11;

import h10.Human;
import org.junit.jupiter.api.Test;

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


}

