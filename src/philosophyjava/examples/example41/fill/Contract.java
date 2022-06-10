package philosophyjava.examples.example41.fill;

public class Contract {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" + "id=" + id + '}';
    }
}
