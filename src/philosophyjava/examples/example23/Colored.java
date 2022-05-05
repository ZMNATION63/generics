package philosophyjava.examples.example23;

public class Colored <T extends HasColor> {
    T item;
    Colored(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color color() {
        return item.getColor();
    }
}
