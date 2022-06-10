package philosophyjava.examples.example42.fill2;

import philosophyjava.examples.example5.Generator;

/**
 * Использование адаптеров для моделирования латентной типизации.
 */
public class Fill2 {
//    Версия с маркером:
    public static <T> void fill(Addable<T> addable, Class<? extends T> classToken, int size) {
        for (int i = 0; i < size; i++) {
            try {
                addable.add(classToken.newInstance());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

//    Версия с генератором
    public static <T> void fill(Addable<T> addable, Generator<T> generator, int size) {
        for (int i = 0; i < size; i++) {
            addable.add(generator.next());
        }
    }
}

