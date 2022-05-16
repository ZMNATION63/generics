package philosophyjava.examples.example27;

import philosophyjava.examples.example26.Apple;
import philosophyjava.examples.example26.Fruit;

public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<>(new Apple());
//        Holder<? extends Fruit> holder = Apple;
    }
}
