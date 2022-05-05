package philosophyjava.examples.example23;

public class Solid <T extends Dimension & HasColor & Weight> {
    T item;

    public Solid(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    int getX() { return item.x; }
    int getY() { return item.y; }
    int getZ() { return item.z; }

    java.awt.Color color() {return item.getColor();}
    int weight() {return item.weight();}
}
