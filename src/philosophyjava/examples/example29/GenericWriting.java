package philosophyjava.examples.example29;

import philosophyjava.examples.example26.Apple;
import philosophyjava.examples.example26.Fruit;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruits = new ArrayList<Fruit>();
    static void f1 () {
        writeExact(apples, new Apple());
    }

    static <T> void writeWriteWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writeWriteWithWildcard(apples, new Apple());
        writeWriteWithWildcard(fruits, new Fruit());
    }

    public static void main(String[] args) {
        f1();
        System.out.println(apples + " " + apples.size());
        System.out.println("---------");
        f2();
        System.out.println(apples + " " + apples.size());
        System.out.println(fruits + " " + fruits.size());
    }
}
