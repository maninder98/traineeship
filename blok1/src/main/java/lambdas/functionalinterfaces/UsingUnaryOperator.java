package lambdas.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UsingUnaryOperator {

    public static <T> List<T> map(List<T> list, UnaryOperator<T> f) {
        List<T> result = new ArrayList<>();
        // transform each element in the list using f and put the transformed element in result
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }
}
