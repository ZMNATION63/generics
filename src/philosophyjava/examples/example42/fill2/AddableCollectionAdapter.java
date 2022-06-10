package philosophyjava.examples.example42.fill2;

import java.util.Collection;

/**
 * Для адаптации базового типа необходимо использовать композицию.
 * Включение поддержки Addable в произвольный контейнер Collection
 * с использованием композиции:
 * @param <T>
 */
public class AddableCollectionAdapter<T> implements Addable<T> {
    private Collection<T> c;

    public AddableCollectionAdapter(Collection<T> c) {
        this.c = c;
    }

    @Override
    public void add(T t) {
        c.add(t);
    }
}
