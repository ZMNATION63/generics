package philosophyjava.examples.example31.notselfbounded;

import philosophyjava.examples.example31.A;
import philosophyjava.examples.example31.SelfBounded;

public class SelfBoundingMethods {
    static <T extends SelfBounded<T>> T f(T args) {
        return args.set(args).get();
    }

    public static void main(String[] args) {
        A a = f(new A());
    }
}
