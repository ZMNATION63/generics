package philosophyjava.examples.example8;

import philosophyjava.examples.example5.Fibonacci;
import philosophyjava.examples.example5.Generator;
import philosophyjava.examples.example5.coffee.Coffee;
import philosophyjava.examples.example5.coffee.CoffeeGenerator;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<>(), new CoffeeGenerator(), 4);

        for (Coffee c:coffees) {
            System.out.println(c);
        }

        Collection<Integer> fnum = fill(new ArrayList<>(), new Fibonacci(), 12);
        for (Integer i:fnum) {
            System.out.print(i + " ");
        }
    }
}
