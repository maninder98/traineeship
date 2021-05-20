package lambdas.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UsingPredicate {

    public static List<String> filter(List<String> list, Predicate<String> p) {
        List<String> result = new ArrayList<>();
        // copy the elements from list which meet p to result
        for (String s : list) {
            if (p.test(s)) {
                result.add(s);
            }
        }
        return result;
    }
}

