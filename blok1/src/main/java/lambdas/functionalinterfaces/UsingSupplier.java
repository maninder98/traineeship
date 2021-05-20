package lambdas.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class UsingSupplier {
    public static List<String> concat(List<String> list, Supplier<String> s) {
        List<String> result = new ArrayList<>();

        // concat each element from list with the result of s and put the new element in result
        for (String t : list) {
            result.add(t + s.get()); // PURE function? NO!
        }

        // functional style (and void compatibility):
        // list.stream()
        //         .filter(i -> i.length() > 5)
        //         .forEach(result::add);

        return result;
    }

}

