package philosophyjava.examples.example42.fill2;

import philosophyjava.examples.example42.fill2.Adapter;
import philosophyjava.examples.example42.fill2.AddableCollectionAdapter;
import philosophyjava.examples.example42.fill2.Fill2;
import philosophyjava.examples.example5.coffee.Coffee;
import philosophyjava.examples.example5.coffee.Latte;

import java.util.ArrayList;
import java.util.List;

public class Fill2Test {
    public static void main(String[] args) {
        List<Coffee> carrie = new ArrayList<>();
        Fill2.fill(new AddableCollectionAdapter<>(carrie), Coffee.class, 3);
        Fill2.fill(Adapter.collectionAdapter(carrie), Latte.class, 2);

        for (Coffee coffee:carrie) {
            System.out.println(coffee);
        }
    }
}
