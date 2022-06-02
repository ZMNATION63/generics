package philosophyjava.examples.example29;

import philosophyjava.examples.example26.Apple;
import philosophyjava.examples.example26.Fruit;

import java.util.ArrayList;
import java.util.List;

public class GenericReading {
    static <T> T readingExact (List<T> list) {
        return list.get(0);
    }

    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruits = new ArrayList<Fruit>();

    static void f1() {
        Apple apple = readingExact(apples);
        Fruit fruit = readingExact(fruits);

        fruit = readingExact(apples);
    }

    static class Reader<T> {
        T readExact(List<T> list) {
            return list.get(0);
        }

        static void f2() {
            Reader<Fruit> fruitReader = new Reader<Fruit>();
            Fruit fruit = fruitReader.readExact(fruits);
        }
    }


    static class CovariantReader<T> {
        T readCovariant(List<? extends T> list) {
            return list.get(0);
        }

        static void f3() {
            CovariantReader<Fruit> covariantReader = new CovariantReader<Fruit>();
            Fruit a = covariantReader.readCovariant(fruits);
            Fruit b = covariantReader.readCovariant(apples);
        }
    }

}
