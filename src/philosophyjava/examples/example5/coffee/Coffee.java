package philosophyjava.examples.example5.coffee;

public class Coffee {
    private static long counter = 0;
    private static long id = counter++;
    public String toString() {
        return getClass().toString() + " " + id;
    }
}
