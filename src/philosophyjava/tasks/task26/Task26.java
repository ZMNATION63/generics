package philosophyjava.tasks.task26;

import philosophyjava.examples.example33.checkedlist.Dog;
import philosophyjava.examples.example5.coffee.Americano;
import philosophyjava.examples.example5.coffee.Cappucchino;
import philosophyjava.examples.example5.coffee.Coffee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 35. (1) Измените пример CheckedListjava так, чтобы в нем использовались классы coffee, определенные в этой главе
 */
public class Task26 {
    @SuppressWarnings("unchecked")
    static void checkedType(List probablyCofee) {
        System.out.println(probablyCofee.getClass().getSimpleName());
        probablyCofee.add(new Cappucchino());
    }

    public static void main(String[] args) {
        List<Cappucchino> cappucchino = new ArrayList<>();
        checkedType(cappucchino);

        List<Americano> americanos = Collections.checkedList(new ArrayList<>(), Americano.class);

        try {
            checkedType(americanos);
        } catch (Exception e) {
            System.out.println(e);
        }

        List<Coffee> coffees = Collections.checkedList(new ArrayList<>(), Coffee.class);

        try {
            checkedType(coffees);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
