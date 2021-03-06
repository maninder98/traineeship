package h12;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

class PersonTest {

    @Test
    void annotationTest() {
        Method[] methods = Person.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                System.out.println("annotations: " + annotation.value());
            } else if (method.isAnnotationPresent(MyAnnotation2.class)) {
                MyAnnotation2 annotation2 = method.getAnnotation(MyAnnotation2.class);
                System.out.println("annotations: " + annotation2.value());
            }


        }
    }
}








