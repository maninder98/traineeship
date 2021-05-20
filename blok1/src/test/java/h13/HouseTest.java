package h13;

import h10.Android;
import h10.Person;
import org.junit.jupiter.api.Test;

class HouseTest {

    @Test
    void test() {
        House<Android> ha = new House<>(new Android());
        System.out.println(ha);

        House<Person> hp = new House<>(new Person("Piet", 10));
        System.out.println(hp);
    }


}