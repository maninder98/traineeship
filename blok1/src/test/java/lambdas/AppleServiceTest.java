package lambdas;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AppleServiceTest {

    //1
    @Test
    public void shouldPrintApples() {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple("red", 15));
        apples.add(new Apple("green", 15));
        apples.add(new Apple("green", 16));
        apples.add(new Apple("red", 15));

        apples.forEach(System.out::println);

        var appleprinter = new Consumer<Apple>() {
            @Override
            public void accept(Apple apple) {
                System.out.println(apple);
            }
        };

        for (Apple apple : apples) {
            appleprinter.accept(apple);
        }
    }

    @Test
    public void appleWeightsToZero() {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple("red", 15));
        apples.add(new Apple("green", 15));
        apples.add(new Apple("green", 16));
        apples.add(new Apple("red", 15));

        apples.forEach(apple -> apple.setWeight(0));

        for (Apple apple : apples) {
            Assertions.assertThat(apple.getWeight()).isEqualTo(0);
        }
    }

    //2
    @Test
    public void shouldPrintApplesWithLambdas() {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple("red", 15));
        apples.add(new Apple("green", 15));
        apples.add(new Apple("green", 16));
        apples.add(new Apple("red", 15));

        apples.forEach(System.out::println);

    }


}