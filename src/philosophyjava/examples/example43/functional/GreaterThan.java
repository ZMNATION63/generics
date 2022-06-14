package philosophyjava.examples.example43.functional;

public class GreaterThan<T extends Comparable<T>> implements UnaryPredicate<T> {
    private T bound;
    public GreaterThan(T bound) {
        this.bound = bound;
    }
    public boolean test(T x) {
        return x.compareTo(bound) > 0;
    }
}
