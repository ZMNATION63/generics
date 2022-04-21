package philosophyjava.tasks.task13;

import philosophyjava.examples.example5.Generator;
import philosophyjava.examples.example6.GenericMethods;

public class SmallFish {
    private static int count = 1;
    private final int id = count++;

    public static Generator<SmallFish> generator = new Generator<SmallFish>() {
        @Override
        public SmallFish next() {
            return new SmallFish();
        }
    };

    public SmallFish() {
    }

    @Override
    public String toString() {
        return "SmallFish{" + "id=" + id + '}';
    }
}
