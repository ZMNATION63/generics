package philosophyjava.examples.example11;

import philosophyjava.examples.example5.Generator;

public class Customer {
    private static long counter = 1;
    private final long id = counter++;

    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + '}';
    }
}
