package philosophyjava.examples.example31;

public class SelfBounded<T extends SelfBounded<T>> {
    T element;

    public SelfBounded<T> set(T args) {
        element = args;
        return this;
    }

    public T get() {
        return this.element;
    }
}
