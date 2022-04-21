package philosophyjava.examples.example11;

import philosophyjava.examples.example5.Generator;

public class Teller {
    private static long counter = 1;
    private final long id = counter++;

    public Teller() {
    }

    public static Generator<Teller> generator = new Generator<Teller>() {
        @Override
        public Teller next() {
            return new Teller();
        }
    };

    @Override
    public String toString() {
        return "Teller{" + "id=" + id + '}';
    }
}
