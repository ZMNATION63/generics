package philosophyjava.examples.example32;

public class CovariantReturnTypes {
    void test(DerivedGetter getter) {
        Derived derived = getter.get();
    }
}
