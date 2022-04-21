package philosophyjava.examples.example13;

import philosophyjava.examples.example8.Generators;

import java.util.ArrayList;

class Shelf extends ArrayList<Product> {
    public Shelf(int count) {
        Generators.fill(this, Product.generator, count);
    }
}