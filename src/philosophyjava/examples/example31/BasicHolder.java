package philosophyjava.examples.example31;

public class BasicHolder<T> {
    T element;
    void set(T args) {
        this.element = args;
    }

    T get() {
        return this.element;
    }

    void f() {
        System.out.println(this.element.getClass().getSimpleName());
    }
}
