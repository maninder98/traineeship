package lambdas.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

public class UsingConsumer {

    public static void forEach(List<Integer> list, Consumer<Integer> c) {
        // iterate through the list and apply the consumer on each element
        list.forEach(i -> c.accept(i));
    }

}

