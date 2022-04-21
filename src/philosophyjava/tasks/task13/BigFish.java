package philosophyjava.tasks.task13;

import philosophyjava.examples.example5.Generator;

public class BigFish {
    private static int count = 1;
    private final int id = count++;

    public static Generator<BigFish> generator() {
        return new Generator<BigFish>() {

            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }

    public BigFish() {
    }

    @Override
    public String toString() {
        return "BigFish{" + "id=" + id + '}';
    }
}
