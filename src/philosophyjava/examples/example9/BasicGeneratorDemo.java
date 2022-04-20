package philosophyjava.examples.example9;

import philosophyjava.examples.example5.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> generator = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }
    }
}
