package H8;

import h7.Bank.Gender;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testToString() {
        Person p = new Person("Jan", 45);
        p.setGender(Gender.MALE);
        System.out.println(p);
    }

    @Test
    void testEquals() {
        Person p1 = new Person("Jan", 45);
        p1.setGender(Gender.MALE);
        Person p2 = new Person("Jan", 45);
        p2.setGender(Gender.MALE);
        Person p3 = new Person("Peter", 46);
        p3.setGender(Gender.MALE);

        Assertions.assertThat(p1.equals(p2)).isTrue();

        Assertions.assertThat(p1.equals(p3)).isFalse();

    }

    @Test
    void testHashcode() {
        Person p1 = new Person("Jan", 45);
        p1.setGender(Gender.MALE);
        Person p2 = new Person("Jan", 45);
        p2.setGender(Gender.MALE);
        Person p3 = new Person("Peter", 46);
        p3.setGender(Gender.MALE);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        assertEquals(p1.hashCode(), p2.hashCode());
        assertNotEquals(p1.hashCode(), p3.hashCode());
    }

    @Test
    void testReflection() {
        Person p1 = new Person("Jan", 45);

        Class cls = p1.getClass();
        System.out.println("The name of class is " +
                cls.getName());

        //gettings methods through the object
        Method[] methods = cls.getMethods();

        //printing methods
        for (Method method : methods)
            System.out.println("method: " + method.getName());

        //printing fields
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field: " + field.getName());
        }

    }


}