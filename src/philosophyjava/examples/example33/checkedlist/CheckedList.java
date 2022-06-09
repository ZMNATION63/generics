package philosophyjava.examples.example33.checkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyDogs) {
        System.out.println(probablyDogs.getClass().getSimpleName());
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        oldStyleMethod(dogs);

        List<Dog> dogs1 = Collections.checkedList(new ArrayList<>(), Dog.class);

        try {
            oldStyleMethod(dogs1);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }

        List<Animal> animals = Collections.checkedList(new ArrayList<>(), Animal.class);
        try {
            oldStyleMethod(animals);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }

    }
}
