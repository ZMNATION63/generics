package philosophyjava.tasks.task2;

/**
 * 2. (1) Создайте класс для хранения трех объектов одного типа,
 * с методами сохранения и выборки этих объектов и конструктором для инициализации всех трех объектов.
 * @param <T>
 */
public class TypeHolder<T> {
    private T e1;
    private T e2;
    private T e3;

    public TypeHolder(T e1, T e2, T e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public T getE1() {
        return e1;
    }

    public void setE1(T e1) {
        this.e1 = e1;
    }

    public T getE2() {
        return e2;
    }

    public void setE2(T e2) {
        this.e2 = e2;
    }

    public T getE3() {
        return e3;
    }

    public void setE3(T e3) {
        this.e3 = e3;
    }
}
