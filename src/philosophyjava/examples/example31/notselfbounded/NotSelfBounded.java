package philosophyjava.examples.example31.notselfbounded;

public class NotSelfBounded<T> {
    T element;

    NotSelfBounded<T> set(T args) {
        element = args;
        return this;
    }

    T get() {
        return element;
    }
}
