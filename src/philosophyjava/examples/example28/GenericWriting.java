package philosophyjava.examples.example28;

import philosophyjava.examples.example26.Apple;
import philosophyjava.examples.example26.Fruit;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {
    static <T> void writeExtract(List<T> list, T item) {
        list.add(item);
    }

    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruits = new ArrayList<Fruit>();
    static void f1() {
        writeExtract(apples, new Apple());
        writeExtract(fruits, new Apple());
        // Несовместимые типы: обнаружен Fruit, требуется Apple
        System.out.println(apples);
        System.out.println(fruits);
    }

    static <T> void writeWithWildcard(List <? super T> list, T item) {
        list.add(item);
    }

    static <T> void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruits, new Apple());
        System.out.println(apples);
        System.out.println(fruits);
    }

    public static void main(String[] args) {
        f1();
        System.out.println("---------");
        f2();
    }
}
