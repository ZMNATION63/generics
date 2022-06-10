package philosophyjava.examples.example43.functional;

/**
 * Извлечение результата из параметра-накопителя
 * @param <T>
 */
public interface Collector<T> extends UnaryFunction<T, T> {
    T result();
}
