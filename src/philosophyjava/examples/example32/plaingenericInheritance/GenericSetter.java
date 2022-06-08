package philosophyjava.examples.example32.plaingenericInheritance;

public class GenericSetter<T> {
    void set(T args) {
        System.out.println("GenericSetter.set( " + args.getClass().getSimpleName() + " )");
    }
}
