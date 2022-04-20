package philosophyjava.tasks.task11;

import philosophyjava.examples.example5.Generator;
import philosophyjava.examples.example5.coffee.Coffee;
import philosophyjava.examples.example5.coffee.CoffeeGenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * (4) Перегрузите метод fill() так, чтобы аргументы и возвращаемые типы были конкретными подтипами Collection:
 * List,
 * Queue,
 * Set.
 * При этом информация о типе контейнера не теряется. Сможет ли перегруженная версия различать List и LinkedList?
 */
public class ReloadMethod {
    public static <T> Collection<T> fill(Generator<T> gen, int n, int option) {
        Collection<T> newCollection = null;
        switch (option) {
            case 1 : newCollection = new ArrayList<T>();
                break;
            case 2 : newCollection = new HashSet<T>();
                break;
            case 3 : newCollection = new LinkedList<T>();
                break;
        }
        for (int i = 0; i < n; i++) {
            newCollection.add(gen.next());
        }
        return newCollection;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new CoffeeGenerator(), 4, 2);

        for (Coffee c:coffees) {
            System.out.println(c);
        }
        System.out.println(coffees.getClass().getName());
    }
}
