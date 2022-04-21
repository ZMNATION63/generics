package philosophyjava.examples.example10;

import java.util.HashSet;
import java.util.Set;

public class Sets {
//    сложение
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>();
        result.addAll(b);
        return result;
    }

//    возврвщам пересечение
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>();
        result.retainAll(b);
        return result;
    }

//    вычитание подмножества из множества
    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<>(superset);
        result.removeAll(subset);
        return result;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a,b));
    }
}
