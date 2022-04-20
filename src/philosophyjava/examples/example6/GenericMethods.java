package philosophyjava.examples.example6;

public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(1);
        gm.f(1L);
        gm.f("S");
        gm.f('c');
        gm.f(2.0);

    }
}
