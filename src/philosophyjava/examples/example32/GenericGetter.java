package philosophyjava.examples.example32;

import philosophyjava.examples.example31.GenericType;

public interface GenericGetter <T extends GenericType<T>> {
    T get();
}
