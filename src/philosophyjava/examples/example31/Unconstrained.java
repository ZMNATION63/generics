package philosophyjava.examples.example31;

public class Unconstrained {
    public static void main(String[] args) {
        BasicOther b = new BasicOther();
        BasicOther b2 = new BasicOther();

        b.set(new Other());

        Other other = b.get();

        System.out.print("b.getClassSimpleName = ");
        b.f();

        b2.set(other);

        System.out.println("b2.getClassSimpleName = " + b2.get().getClass().getSimpleName());
    }
}
