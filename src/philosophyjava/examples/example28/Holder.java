package philosophyjava.examples.example28;

import philosophyjava.examples.example26.Apple;
import philosophyjava.examples.example26.Fruit;

public class Holder<K> {
    K value;

    public Holder() {
    }

    public Holder(K value) {
        this.value = value;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<Apple>(new Apple());
        Apple a = appleHolder.getValue();
        System.out.println(a);

//        Holder<? extends Fruit> fruit = Apple;

    }
}
