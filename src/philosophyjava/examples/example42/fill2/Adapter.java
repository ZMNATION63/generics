package philosophyjava.examples.example42.fill2;

import java.util.Collection;

/**
 * Вспомогательный класс для автоматической фиксации типа
 */
public class Adapter {
    public static <T> Addable<T> collectionAdapter(Collection c) {
        return new AddableCollectionAdapter<T>(c);
    }
}
