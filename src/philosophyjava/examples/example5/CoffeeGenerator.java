package philosophyjava.examples.example5;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {Latte.class, Mocha.class, Cappucchino.class, Americano.class, Breve.class};
    private static Random random = new Random(47);

    public CoffeeGenerator() {
    }

    private int size = 0;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            throw new RuntimeException();
        }
    }

    class CoffeeIterator implements Iterable<Coffee>, Iterator<Coffee> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Iterator<Coffee> iterator() {
            return null;
        }
    };

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();

        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }

        for (Coffee coffee: gen) {
            System.out.println(coffee);
        }
    }
}
