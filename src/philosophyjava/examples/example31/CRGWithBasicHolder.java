package philosophyjava.examples.example31;

public class CRGWithBasicHolder {
    public static void main(String[] args) {
        Subtype subtype1 = new Subtype();
        Subtype subtype2 = new Subtype();
        subtype1.set(subtype2);
        Subtype subtype3 = subtype1.get();

        subtype3.f();
    }
}
