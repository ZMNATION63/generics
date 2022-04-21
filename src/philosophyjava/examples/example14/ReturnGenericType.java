package philosophyjava.examples.example14;

public class ReturnGenericType<T> {
    private T obj;

    public ReturnGenericType(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
