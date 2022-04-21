package philosophyjava.examples.example13;

import philosophyjava.examples.example5.Generator;
import philosophyjava.examples.example8.Generators;

import java.util.ArrayList;
import java.util.Random;

public class Product {
    private final int id;
    private String descryption;
    private Double price;

    public Product(int id, String descryption, Double price) {
        this.id = id;
        this.descryption = descryption;
        this.price = price;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", descryption='" + descryption + '\'' + ", price=" + price + '}';
    }

    public void priceChange(Double change) {
        this.price = this.price + change;
    }

    public static Generator<Product> generator = new Generator<Product>() {
        private Random random = new Random(47);
        @Override
        public Product next() {
            return new Product(random.nextInt(10000),"test",
                Math.round(random.nextDouble() * 1000) + 0.99);
        }
    };
}
