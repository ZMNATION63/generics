package philosophyjava.examples.example31;

public class C extends SelfBounded<C> {
    C setAndGet(C args) {
        set(args);
        return get();
    }
}
