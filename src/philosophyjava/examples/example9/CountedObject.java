package philosophyjava.examples.example9;

public class CountedObject {
    private static long counter = 0;
    private final static long id = counter++;
    public long id() {return this.id;}
    public String toString() {
        return "CountedObject " + id();
    }
}
