package h7.Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    void testPerson() {
        Person p = new Person("Jan", 45);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        p.haveBirthday(); // person gets one year older
        System.out.println(p.getAge());
        System.out.println(Person.numberOfPossibleGenders);
    }

}